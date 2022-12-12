package Unit_1._1_4.workshift;

public class WorkShift {
    public static void main(String[] args) {
        int hoursWorked = 20;
        int minutesWorked = 42;
        int secondsWorked = 16;
        int totalSecondsWorked;
        hoursWorked *= 3600;
        minutesWorked *= 60;

        totalSecondsWorked = hoursWorked + minutesWorked + secondsWorked;

        System.out.println(totalSecondsWorked);
    }
}
