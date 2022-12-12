package Unit_4.Labs.labs4dand4e;
import java.util.Scanner;

public class Temps {
    public static void main (String[] args) {
        final int HOURS_PER_DAY = 24;
        int temp; // a temperature reading
        Scanner scan = new Scanner(System.in);

        int maxTemp = -1000;
        int minTemp = 1000;

        int maxTempHour = 0;
        int minTempHour = 0;

        // print program heading
        System.out.println ("\nTemperature Readings for " + HOURS_PER_DAY +  " Hour Period\n");


        for (int hour = 0; hour <= HOURS_PER_DAY; hour++) {
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();
            if (temp < minTemp){
                minTemp = temp;
                minTempHour = hour;
            }
            else if (temp > maxTemp) {
                maxTemp = temp;
                maxTempHour = hour;
            }
        }

        System.out.println("Maximum temperature was " + maxTemp + " at " + maxTempHour + " hours.");
        System.out.println("Minimum temperature was " + minTemp + " at " + minTempHour + " hours.");

    }

}
