package inheritance;

class C {
    void display() {
        System.out.println("Class C");
    }
}

class D extends C {
    void display() {
        super.display();
        System.out.println("Class D");
    }
}

public class use_of_super_keyword {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
