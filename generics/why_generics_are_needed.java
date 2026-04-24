// Create a class that stores integers without generics, then rewrite it using generics to make it type-safe.

// Without Generics
class IntBox {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

// With Generics
class Box<T> { // T --> Type Parameter
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class why_generics_are_needed {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.set(10);
        System.out.println(box.get());
    }
}
