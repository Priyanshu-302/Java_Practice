package inheritance;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

}

public class add_child_method {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.bark();
    }
}
