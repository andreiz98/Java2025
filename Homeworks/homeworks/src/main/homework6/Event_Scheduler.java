package homework6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Event_Scheduler {
    public static List<Event_Scheduler> events = new ArrayList<>();
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event_Scheduler(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public Duration timeUntilEvent() {
        return Duration.between(LocalDateTime.now(), eventDateTime);
    }

    public Duration timeUntilReminder() {
        return Duration.between(LocalDateTime.now(), reminderDateTime);
    }

    public static void addEvent(Event_Scheduler e) {
        events.add(e);
    }

    public static void removeEvent(String eventName) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEventName().equalsIgnoreCase(eventName)) {
                events.remove(i);
                break;
            }
        }
    }

    public static List<Event_Scheduler> getUpcomingEvents(int n) {
        List<Event_Scheduler> upcomingEvents = new ArrayList<>();
        for (int i = 0; i < Math.min(n, events.size()); i++) {
            upcomingEvents.add(events.get(i));
        }
        return upcomingEvents;
    }

    public static List<Event_Scheduler> getEventsOn(LocalDate date) {
        List<Event_Scheduler> eventsOnDate = new ArrayList<>();
        for (Event_Scheduler event : events) {
            if (event.getEventDateTime().toLocalDate().equals(date)) {
                eventsOnDate.add(event);
            }
        }
        return eventsOnDate;
    }

    public static List<String> getPendingReminders() {
        List<String> reminders = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'at' hh:mm a");

        for (Event_Scheduler event : events) {
            if (event.getReminderDateTime().isBefore(now.plusHours(24))) {
                reminders.add("You have a reminder for " + event.getEventName() + " on " + event.getReminderDateTime().format(formatter) + ".");
            }
        }
        return reminders;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return eventName + " (" + eventDescription + ") on " + eventDateTime.format(formatter);
    }
}
