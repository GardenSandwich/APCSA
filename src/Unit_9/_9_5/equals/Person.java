package Unit_9._9_5.equals;

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

    //Create a equals method here
    public boolean equals(Person o) {
        return getName().equals(o.getName()) && getBirthday().equals(o.getBirthday());
    }

}
