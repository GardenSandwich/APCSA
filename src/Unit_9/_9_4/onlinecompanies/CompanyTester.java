package Unit_9._9_4.onlinecompanies;

public class CompanyTester {
    public static void main(String[] args) {
        Company company = new Company("CodeHS");
        System.out.println(company);
        System.out.println(company.address());
        System.out.println();
        OnlineCompany onlineCompany = new OnlineCompany("CodeHS", "www.codehs.com");
        System.out.println(onlineCompany);
        System.out.println(onlineCompany.address());

    }
}
