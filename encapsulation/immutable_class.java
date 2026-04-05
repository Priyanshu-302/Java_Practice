package encapsulation;

final class Immutable {
    private final int val;

    public Immutable(int val) {
        this.val = val;
    }

    public int getter() {
        return val;
    }
}

public class immutable_class {
    public static void main(String[] args) {
        Immutable obj = new Immutable(200);
        System.out.println("Value: " + obj.getter());
    }
}
