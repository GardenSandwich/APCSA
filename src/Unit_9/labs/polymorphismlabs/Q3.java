package Unit_9.labs.polymorphismlabs;

public class Q3 {
    public static void main(String[] s) {
        C c = new C();
        M m = new M();
        K k;
        O o = new C();
        H h = new H();
        k = o;
        m = h;
        c = m;
        System.out.println("All compilation errors resolved");
    }
}

class K {}

class O extends K{}

class C extends O{}

class M extends C {}

class H extends M {}
