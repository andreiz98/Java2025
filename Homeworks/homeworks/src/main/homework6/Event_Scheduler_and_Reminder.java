package homework6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import static homework6.Event_Scheduler.*;


public class Event_Scheduler_and_Reminder{
    public static void main(String[] args) {
        LocalDateTime eventTime1 = LocalDateTime.of(2025, 3, 19, 8, 30);
        LocalDateTime reminderTime1 = eventTime1.minusMinutes(15);
        LocalDateTime eventTime2 = LocalDateTime.of(2025, 3, 19, 13, 30);
        LocalDateTime reminderTime2 = eventTime2.minusMinutes(30);
        LocalDateTime eventTime3 = LocalDateTime.of(2025, 3, 19, 19, 30);
        LocalDateTime reminderTime3 = eventTime3.minusMinutes(15);

        Event_Scheduler event1 = new Event_Scheduler("breakfast", "take your breakfast", eventTime1, reminderTime1);
        Event_Scheduler event2 = new Event_Scheduler("launch", "start prepare launch", eventTime2, reminderTime2);
        Event_Scheduler event3 = new Event_Scheduler("dinner", "take your dinner", eventTime3, reminderTime3);

        addEvent(event1);
        addEvent(event2);
        addEvent(event3);

        event1.setEventDateTime(LocalDateTime.of(2025, 3, 20, 8, 30));
        event2.setEventDateTime(LocalDateTime.of(2025, 3, 20, 13, 30));
        event3.setEventDateTime(LocalDateTime.of(2025, 3, 20, 19, 30));


        System.out.println("Upcoming Events: ");
        getUpcomingEvents(3).forEach(System.out::println);
        System.out.println("\nEvents on: " + getEventsOn(LocalDate.of(2025, 3, 20)));
        getPendingReminders().forEach(System.out::println);

        System.out.println("Time until breakfast: " + event1.timeUntilEvent().toHours() + " h");
        System.out.println("Time until launch: " + event2.timeUntilEvent().toHours() + " h");
        System.out.println("Time until dinner: " + event3.timeUntilEvent().toHours() + " h");

        removeEvent("breakfast");
        System.out.println("Events after removing: " + events);
    }
}
