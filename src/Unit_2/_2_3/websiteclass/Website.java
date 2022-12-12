package Unit_2._2_3.websiteclass;

public class Website {

    private String domain = "";
    private String topLevelDomain = "com";
    private int numUsers = 0;

    public Website(String domain, String topLevelDomain, int numUsers) {
        this.domain = domain;
        this.topLevelDomain = topLevelDomain;
        this.numUsers = numUsers;
    }

    public Website(String domain, String topLevelDomain){
        this.domain = domain;
        this.topLevelDomain = topLevelDomain;
    }

    public Website(){

    }

    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";

        return res;
    }
}
