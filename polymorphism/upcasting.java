package polymorphism;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("eating cat food...");
    }
}

public class upcasting {
    public static void main(String[] args) {
        Animal a = new Cat(); // upcasting
        a.eat();
    }
}
