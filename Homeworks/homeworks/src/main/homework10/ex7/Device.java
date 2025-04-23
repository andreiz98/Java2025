package homework10.ex7;

public abstract class Device {
    protected String name;
    protected String room;
    protected DeviceStatus status = DeviceStatus.OK;

    public Device(String name, String room) {
        this.name = name;
        this.room = room;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public double getEnergyUsagePerHour() {
        return 1.0; // default for simulation
    }

    public String getRoom() {
        return room;
    }

    public abstract void executeCommand(String command);
}
