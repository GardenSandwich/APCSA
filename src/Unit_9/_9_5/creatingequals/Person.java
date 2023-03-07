package Unit_9._9_5.creatingequals;

public class Person {
    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    //Create an equals method here
    public boolean equals(Person o) {
        return this.getName().equals(o.getName()) && this.getBirthday().equals(o.getBirthday());
    }

}
