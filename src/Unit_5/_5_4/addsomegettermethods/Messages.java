package Unit_5._5_4.addsomegettermethods;

public class Messages {
    public static void main(String[] args)
    {
        Comment c1 = new Comment("Alan", "I love this!", "12/12/12");
        Comment c2 = new Comment("Ada", "Me too!", "12/12/12");

        System.out.println(c1.getComment());
        System.out.println(c2.getComment());
        System.out.println(c1.getPoster());
        System.out.println(c2.getPoster());
        System.out.println(c1.getDate());
        System.out.println(c2.getDate());

    }
}
