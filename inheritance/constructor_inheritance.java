package inheritance;

class Boy {
    Boy() {
        System.out.println("Class Boy");
        ;
    }
}

class Father extends Boy {
    Father() {
        System.out.println("Class Father");
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        new Father();
    }
}
