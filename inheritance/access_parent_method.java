package inheritance;

class Child {
    void eat() {
        System.out.println("Child eats");
    }
}

class Parent extends Child {
}

public class access_parent_method {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.eat();
    }
}
