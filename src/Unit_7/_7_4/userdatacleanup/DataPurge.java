package Unit_7._7_4.userdatacleanup;

import java.util.ArrayList;
import java.util.HashSet;

public class DataPurge {
    static void removeDuplicates(ArrayList<String> list) {
        HashSet<String> temp = new HashSet<>(list);
        list.clear();
        list.addAll(temp);
    }

    static void removeName(ArrayList<String> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(name)){
                System.out.println(name + "was removed");
                list.remove(i);
                i--;
            }
        }
    }

    static boolean correctlyFormatted(ArrayList<String> list) {
        for (String name: list) {
            String[] splitName = name.split(" ");
            if (splitName.length > 1) {
                if (!(Character.isUpperCase(splitName[0].charAt(0)) && Character.isUpperCase(splitName[1].charAt(0)))) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
