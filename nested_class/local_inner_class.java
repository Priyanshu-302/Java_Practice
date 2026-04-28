package nested_class;

// Inside a method, create a local class that prints a message.
class Test {
    void display() {
        class Inner {
            void msg() {
                System.out.println("Inside local inner class");
            }
        }
        Inner i = new Inner();
        i.msg();
    }
}

public class local_inner_class {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
