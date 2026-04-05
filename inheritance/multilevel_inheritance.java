package inheritance;

class Girl {
    void display1() {
        System.out.println("Class Girl");
    }
}

class Son extends Girl {
    void display2() {
        System.out.println("Class Son");
    }
}

class Dad extends Son {
    void display3() {
        System.out.println("Class Dad");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        new Dad().display1();
        new Dad().display2();
        new Dad().display3();
    }
}
