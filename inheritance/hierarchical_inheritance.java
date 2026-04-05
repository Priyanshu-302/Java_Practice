package inheritance;

class Reptile {
    void show1() {
        System.out.println("Class Reptile");
    }
}

class Snake extends Reptile {
    void show2() {
        System.out.println("Class Snake");
    }
}

class Cobra extends Reptile {
    void show3() {
        System.out.println("Class Cobra");
    }
}

public class hierarchical_inheritance {
    public static void main(String[] args) {
        new Snake().show1();
        new Snake().show2();
        new Cobra().show1();
        new Cobra().show3();
    }
}
