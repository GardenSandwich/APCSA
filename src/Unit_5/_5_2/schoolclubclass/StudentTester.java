package Unit_5._5_2.schoolclubclass;

public class StudentTester {
    public static void main(String[] args) {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        SchoolClub mathClub = new SchoolClub(alan, "Math");


        System.out.println(alan);
        System.out.println(ada);
        System.out.println(mathClub);
    }
}
