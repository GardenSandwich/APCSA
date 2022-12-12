package Unit_2._2_3.websiteclass;

public class WebsiteTester {
    public static void main(String[] args) {
        // Create a website with a domain, top level domain, and number of users
        Website codehs = new Website("codehs", "com", 1000000);
        System.out.println(codehs.toString());

        // Create a website with a domain and top level domain
        Website codehs2 = new Website("codehs", "edu");
        System.out.println(codehs2.toString());

        // Create a website with no parameters
        Website codehs3 = new Website();
        System.out.println(codehs3.toString());
    }
}
