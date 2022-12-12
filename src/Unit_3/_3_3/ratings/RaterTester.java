package Unit_3._3_3.ratings;

public class RaterTester {
    public static void main(String[] args){
        Rater comp1 = new Rater("Bruh", 3.0);
        comp1.updateReview();
        System.out.println(comp1.toString());
        comp1.setRating(900.0);
        comp1.updateReview();
        System.out.println(comp1.toString());
    }
}
