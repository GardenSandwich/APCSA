package Unit_9._9_2.students;

public class StudentAthlete extends Student{
    String sport;
    String level;

    public StudentAthlete(String name, int id, double gpa, String sport, String level) {
        super(name, id, gpa);
        this.sport = sport;
        this.level = level;
    }

    public String toString() {
        return super.toString() + " plays " + sport;
    }

    public String getSport() {
        return sport;
    }

    public String getLevel() {
        return level;
    }

}
