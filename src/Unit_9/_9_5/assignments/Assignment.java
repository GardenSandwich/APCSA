package Unit_9._9_5.assignments;

public class Assignment {
    String name;
    String dueDate;
    double availablePoints;
    double earnedPoints;

    public Assignment(String name, String dueDate, double availablePoints, double earnedPoints) {
        this.name = name;
        this.dueDate = dueDate;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getAvailablePoints() {
        return availablePoints;
    }

    public void setAvailablePoints(double availablePoints) {
        this.availablePoints = availablePoints;
    }

    public double getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }
}
