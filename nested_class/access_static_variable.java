package nested_class;

// Access outer static variable from static nested class.
class Outers {
    static int x = 10;
    static class Inners {
        void display() {
            System.out.println(x);
        }
    }
}

public class access_static_variable {
    public static void main(String[] args) {
        Outers.Inners inner = new Outers.Inners();
        inner.display();
    }
}
