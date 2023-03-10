package Unit_9._9_5.onlinecompaniesrevisited;

import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTester {
    public static void main(String[] args) {
        ArrayList<Company> companies = new ArrayList<Company>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a company name, enter 'exit' to quit:");
            String name = input.nextLine();
            if (name.equals("exit")) {
                break;
            }
            System.out.print("Is this an online company, 'yes' or 'no':");
            String online = input.nextLine();
            if(online.equals("yes")) {
                System.out.print("Please enter the website address: ");
                String webAddress = input.nextLine();
                companies.add(new OnlineCompany(name, webAddress));
            } else {
                System.out.print("Please enter the street address: ");
                String streetAddress = input.nextLine();
                System.out.print("Please enter the city: ");
                String city = input.nextLine();
                System.out.print("Please enter the state: ");
                String state = input.nextLine();
                companies.add(new Company(name, streetAddress, city, state));
            }
        }

        for (Company company : companies) {
            System.out.println(company);
        }
    }
}
