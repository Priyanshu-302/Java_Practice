package encapsulation;

class B {
    private int x;

    public void setX(int x) {
        this.x = x;
    }
}

public class only_setter {
    public static void main(String[] args) {
        B obj = new B();
        obj.setX(100);
        System.out.println("Value of x set successfully ");
    }
}
