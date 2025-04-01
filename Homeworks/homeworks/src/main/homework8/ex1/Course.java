package homework8.ex1;

public class Course {
    private String name, schedule, duration, description;
    Professors assignedProfessor;

    public Course(String name, String schedule, String duration, String description){
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public void setAssignedProfessor(Professors assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + getName());
        System.out.println("Schedule: " + getSchedule());
        System.out.println("Duration: " + getDuration());
        System.out.println("Description: " + getDescription());
        if (assignedProfessor != null) {
            System.out.println("Professor: " + assignedProfessor.getFirstName() + " " + assignedProfessor.getLastName());
        } else {
            System.out.println("No professor assigned.");
        }
    }
}
