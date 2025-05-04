//package homework11;
//
//import javax.management.relation.Role;
//import java.util.Date;
//import java.util.List;
//
//public abstract class User implements Notifiable{
//    protected String id;
//    protected String name;
//    protected String email;
//    protected Role role;
//
//    public abstract void viewProgress();
//}
//
//class Admin extends User{
//    public void modifyApk();
//    public void manageUsers();
//    public void sendNotification(String message);
//    public void viewProgress();
//}
//
//class Manager extends User {
//    private List<Team> teams;
//
//    public void viewEmployees();
//    public void viewResources();
//    public void modifyTeamStructure(Team team, List<Employee> newMembers, Employee newLead);
//    public void changeEmployeePosition(Employee employee, boolean makeLead);
//    public void sendNotification(String message);
//    public void viewProgress();
//}
//
//class Employee {
//    private String id;
//    private String name;
//    private String position;
//    private String email;
//    private boolean isTeamLead;
//}
//
//class Team {
//    private String id;
//    private Employee teamLead;
//    private List<Employee> members;
//
//    public void addMember(Employee employee);
//    public void removeMember(Employee employee);
//    public void changeTeamLead(Employee newLead);
//}
//
//class Resource {
//    private String id;
//    private String name;
//    private int quantityAvailable;
//    private int quantityNeeded;
//}
//
//class Project {
//    private String projectId;
//    private String name;
//    private List<Team> teams;
//    private List<Resource> resources;
//    private Progress progress;
//
//    public void updateProgress(Progress progress);
//    public Progress getProgress();
//}
//
//class Progress {
//    private String description;
//    private Date updateDate;
//    private double completionPercentage;
//}
//
//class EmailService {
//    public void sendEmail(String to, String subject, String body);
//}
