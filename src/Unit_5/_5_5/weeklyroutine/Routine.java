package Unit_5._5_5.weeklyroutine;

public class Routine {

    private double school;

    private double sleep;

    private double friends;

    private double hobbies;


    public Routine() {}


    public double getSchool() {
        return school;
    }

    public void setSchool(double school) {
        this.school = school;
    }

    public double getSleep() {
        return sleep;
    }

    public void setSleep(double sleep) {
        this.sleep = sleep;
    }

    public double getFriends() {
        return friends;
    }

    public void setFriends(double friends) {
        this.friends = friends;
    }

    public double getHobbies() {
        return hobbies;
    }

    public void setHobbies(double hobbies) {
        this.hobbies = hobbies;
    }

    public void printTotal(){
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + school*7);
        System.out.println("Sleeping: " + sleep*7);
        System.out.println("With Friends: " + friends*7);
        System.out.println("Doing fun stuff: " + hobbies*7);
        System.out.println("You're busy " + ((school + sleep + friends + hobbies) * 7) +" hours a week!");
    }
}
