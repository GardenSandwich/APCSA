package Unit_9.labs.polymorphismlabs;

public class Q1 {
    public static void main(String[] args) {
        X x = new X(10);
        Y y = new Y(11, 21);
        Z z = new Z(12, 22, 32);
    }
}

class X {
    int i;

    X(int i) {
        this.i = i;
    }
}

class Y extends X{
    int j;
    public Y(int i, int j){
        super(i);
        this.j = j;
    }
}

class Z extends Y{
    int k;

    public Z(int i, int j, int k){
        super(i, j);
        this.k = k;
    }
}