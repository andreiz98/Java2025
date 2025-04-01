package homework8.ex4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FitnessTracking {
    private List<Workout> workouts = new ArrayList<>();
    private Map<String, Double> weeklyGoals = new HashMap<>();

    public void logWorkout(String type, int duration, double distance, double weightLifted, LocalDate date) {
        workouts.add(new Workout(type, duration, distance, weightLifted, date));
    }

    public void setWeeklyGoal(String type, double goal) {
        weeklyGoals.put(type, goal);
    }

    public void generateWeeklySummary() {
        Map<String, Double> progress = new HashMap<>();

        for (Workout w : workouts) {
            progress.put(w.type, progress.getOrDefault(w.type, 0.0) + (w.type.equals("Running") ? w.distance : w.weightLifted));
        }

        System.out.println("Weekly Summary:");
        for (Map.Entry<String, Double> entry : weeklyGoals.entrySet()) {
            String type = entry.getKey();
            double goal = entry.getValue();
            double achieved = progress.getOrDefault(type, 0.0);
            System.out.println(type + " - Goal: " + goal + ", Achieved: " + achieved + (achieved >= goal ? " (Goal Met)" : " (Goal Not Met)"));
        }
    }

    public void searchWorkouts(String type, String date) {
        System.out.println("Search Results:");
        for (Workout w : workouts) {
            if ((type == null || w.type.equalsIgnoreCase(type)) && (date == null || w.date.equals(date))) {
                System.out.println(w);
            }
        }
    }
}

class Workout{
    String type;
    int duration;
    double distance;
    double weightLifted;
    LocalDate date;

    public Workout(String type, int duration, double distance, double weightLifted, LocalDate date) {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
        this.weightLifted = weightLifted;
        this.date = date;
    }
}
