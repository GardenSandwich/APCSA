package Unit_4._4_1.divisibility;
//truly a fun exercise for the times.

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits(1239483);
    }

    public static void extractDigits(int num) {
        int index = 1;
        int count =0;
        while (index<=num){
            while((num%(index*10)) != 0){
                num -= index;
                count++;
            }
            System.out.println(count);
            count = 0;
            index *= 10;
        }
    }
}
