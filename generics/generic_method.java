// Write a generic method to print any array.
class A {
    public static <T> void print(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }
}

public class generic_method {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] words = {"Hi", "Hello"};

        A.print(nums);
        A.print(words);
    }
}
