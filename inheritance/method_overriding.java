package inheritance;

class Std {
    void study() {
        System.out.println("Std is studying");
    }
}

class Topper extends Std {
    void study() {
        System.out.println("Topper is studying");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        Topper obj = new Topper();
        obj.study();
    }
}
