package Unit_7._7_4.billboardtop10;

import java.util.ArrayList;

public class Billboard {
    private ArrayList<Musician> top10 = new ArrayList<>();

    public void add(Musician musician){
        if (musician.getIsPlatinum()){
            if (top10.size() < 10){
                top10.add(musician);
            } else {
                this.replace(musician);
            }
        } else {
            System.out.println("Sorry, " + musician.getName() + " does not qualify for Top 10");
        }
    }

    public void replace(Musician musician){
        int lowestWeekIndex = 0;
        for (int i = 0; i < top10.size(); i++) {
            if (top10.get(i).getWeeksInTop40() < top10.get(lowestWeekIndex).getWeeksInTop40()) lowestWeekIndex = i;
        }
        if(top10.get(lowestWeekIndex).getWeeksInTop40() < musician.getWeeksInTop40()){
            System.out.println("The musician " + top10.get(lowestWeekIndex).getName() + " has been replaced by " + musician.getName() + ".");
            top10.set(lowestWeekIndex, musician);
        } else {
            System.out.println("Sorry, " + musician.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }

    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
