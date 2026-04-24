// Create a generic method that finds the maximum of two numbers using extends Comparable.

class B {
    public static <T extends Comparable<T>> T max(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }
}

public class upper_bound {
    public static void main(String[] args) {
        System.out.println(B.max(10, 20));
        System.out.println(B.max("apple", "banana"));
    }
}
