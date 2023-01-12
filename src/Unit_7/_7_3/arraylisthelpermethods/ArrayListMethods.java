package Unit_7._7_3.arraylisthelpermethods;

import java.util.ArrayList;

public class ArrayListMethods {
    static void print(ArrayList<Double> arrayList) {
        for (Double num: arrayList) {
            System.out.println(num);
        }
    }

    static void condense(ArrayList<Double> arrayList) {
        //for every two values multiply them together and remove the second value
        for (int i = 0; i < arrayList.size() - 1; i++) {
            arrayList.set(i, arrayList.get(i) * arrayList.get(i + 1));
            arrayList.remove(i + 1);
        }
    }
    
    static void duplicate(ArrayList<Double> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.get(i));
        }
    }
}
