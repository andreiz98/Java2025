package homework10.ex7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

enum Role {
    HOMEOWNER, FAMILY, GUEST
}

enum DeviceStatus {
    OK, LOW_BATTERY, MALFUNCTION
}

class User {
    private String name;
    private Role role;
    private List<String> accessibleRooms;

    public User(String name, Role role, List<String> accessibleRooms) {
        this.name = name;
        this.role = role;
        this.accessibleRooms = accessibleRooms;
    }

    public Role getRole() {
        return role;
    }

    public boolean canAccessRoom(String roomName) {
        return role == Role.HOMEOWNER || role == Role.FAMILY || accessibleRooms.contains(roomName);
    }

    public String getName() {
        return name;
    }
}

class Light extends Device {
    private boolean isOn = false;

    public Light(String name, String room) {
        super(name, room);
    }

    @Override
    public void executeCommand(String command) {
        switch (command.toLowerCase()) {
            case "on":
                isOn = true;
                System.out.println(name + " in " + room + " is ON");
                break;
            case "off":
                isOn = false;
                System.out.println(name + " in " + room + " is OFF");
                break;
            default:
                System.out.println("Invalid command for light.");
        }
    }
}

class Thermostat extends Device {
    private double temperature = 22.0;

    public Thermostat(String name, String room) {
        super(name, room);
    }

    @Override
    public void executeCommand(String command) {
        try {
            temperature = Double.parseDouble(command);
            System.out.println(name + " in " + room + " set to " + temperature + "°C");
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input.");
        }
    }
}

class Door extends Device {
    private boolean locked = true;

    public Door(String name, String room) {
        super(name, room);
    }

    @Override
    public void executeCommand(String command) {
        if ("lock".equalsIgnoreCase(command)) {
            locked = true;
            System.out.println(name + " in " + room + " is LOCKED");
        } else if ("unlock".equalsIgnoreCase(command)) {
            locked = false;
            System.out.println(name + " in " + room + " is UNLOCKED");
        } else {
            System.out.println("Invalid door command.");
        }
    }
}

class Room {
    private String name;
    private List<Device> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getName() {
        return name;
    }
}

class Automation {
    private String description;
    private BooleanSupplier condition;
    private Runnable action;

    public Automation(String description, BooleanSupplier condition, Runnable action) {
        this.description = description;
        this.condition = condition;
        this.action = action;
    }

    public void evaluate() {
        if (condition.getAsBoolean()) {
            System.out.println("Automation Triggered: " + description);
            action.run();
        }
    }
}

class WeatherService {
    public static double getCurrentTemperature() {
        return 5.5;
    }

    public static boolean isRainExpected() {
        return true;
    }
}


class VoiceCommandParser {
    private List<Room> rooms;

    public VoiceCommandParser(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void interpretCommand(User user, String voiceCommand) {
        voiceCommand = voiceCommand.toLowerCase();

        for (Room room : rooms) {
            if (voiceCommand.contains(room.getName().toLowerCase())) {
                for (Device device : room.getDevices()) {
                    String deviceType = device.getClass().getSimpleName().toLowerCase();
                    if (voiceCommand.contains(deviceType)) {
                        if (voiceCommand.contains("turn on") || voiceCommand.contains("switch on")) {
                            device.executeCommand("on");
                        } else if (voiceCommand.contains("turn off") || voiceCommand.contains("switch off")) {
                            device.executeCommand("off");
                        } else if (voiceCommand.contains("lock")) {
                            device.executeCommand("lock");
                        } else if (voiceCommand.contains("unlock")) {
                            device.executeCommand("unlock");
                        } else if (voiceCommand.contains("set") && voiceCommand.contains("thermostat")) {
                            int index = voiceCommand.indexOf("to");
                            if (index != -1) {
                                String numberPart = voiceCommand.substring(index + 2).replaceAll("[^\\d.]", "");
                                device.executeCommand(numberPart);
                            }
                        }
                        return;
                    }
                }
            }
        }

        System.out.println("Voice command not recognized or no matching device found.");
    }
}

class MaintenanceService {
    public static void runRoutineCheck(List<Room> rooms) {
        System.out.println("\n--- Running Maintenance Check ---");
        for (Room room : rooms) {
            for (Device device : room.getDevices()) {
                if (device.getStatus() != DeviceStatus.OK) {
                    System.out.println("🛠️  Maintenance Alert: " + device.name + " in " + room.getName() + " is reporting status: " + device.getStatus());
                }
            }
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Room livingRoom = new Room("Living Room");
        Room bedroom = new Room("Bedroom");

        Light light1 = new Light("Ceiling Light", "Living Room");
        Thermostat thermostat = new Thermostat("ThermoPlus", "Living Room");
        Door frontDoor = new Door("Front Door", "Living Room");

        livingRoom.addDevice(light1);
        livingRoom.addDevice(thermostat);
        livingRoom.addDevice(frontDoor);

        User homeowner = new User("Alice", Role.HOMEOWNER, List.of());
        User guest = new User("Bob", Role.GUEST, List.of("Living Room"));

        controlDevice(homeowner, light1, "on");
        controlDevice(guest, thermostat, "25");
        controlDevice(guest, frontDoor, "unlock");

        Automation coldWeatherAutomation = new Automation("Turn on heating if cold", () -> WeatherService.getCurrentTemperature() < 10, () -> thermostat.executeCommand("22"));
        coldWeatherAutomation.evaluate();

        VoiceCommandParser vcp = new VoiceCommandParser(List.of(livingRoom, bedroom));
        vcp.interpretCommand(homeowner, "Turn off the living room light");
        vcp.interpretCommand(homeowner, "Set thermostat to 22 degrees");

        thermostat.setStatus(DeviceStatus.LOW_BATTERY);
        MaintenanceService.runRoutineCheck(List.of(livingRoom, bedroom));
    }

    public static void controlDevice(User user, Device device, String command) {
        if (user.canAccessRoom(device.getRoom())) {
            System.out.println("\n" + user.getName() + " controls " + device.getClass().getSimpleName() + ":");
            device.executeCommand(command);
        } else {
            System.out.println("\nAccess Denied for " + user.getName() + " to room: " + device.getRoom());
        }
    }
}