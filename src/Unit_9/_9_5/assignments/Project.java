package Unit_9._9_5.assignments;

public class Project extends Assignment{
    boolean groups;
    boolean presentation;

    public Project(String name, String dueDate, double availablePoints, double earnedPoints, boolean hasGroups, boolean hasPresentation) {
        super(name, dueDate, availablePoints, earnedPoints);
        this.groups = hasGroups;
        this.presentation = hasPresentation;
    }

    public boolean hasGroups() {
        return groups;
    }

    public void setGroups(boolean groups) {
        this.groups = groups;
    }

    public boolean hasPresentation() {
        return presentation;
    }

    public void setPresentation(boolean presentation) {
        this.presentation = presentation;
    }
}
