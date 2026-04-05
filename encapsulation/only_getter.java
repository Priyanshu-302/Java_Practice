package encapsulation;

class A {
    private int x = 100;

    public int getX() {
        return x;
    }
}

public class only_getter {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Value of x: " + obj.getX());
    }
}
