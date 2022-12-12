package Unit_2._2_7.autofill;

public class FormFillTester {
    public static void main(String[] args) {
        FormFill fill = new FormFill("John", "Doe");
        fill.setBirthday(0, 2000);
        fill.setEmailAddress("JohnDoe@email.com");

        System.out.println(fill.fullName());
        System.out.println(fill.birthday());
        System.out.println(fill.contactInformation());
    }

}
