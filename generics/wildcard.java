// Write a method that prints elements of any list using wildcard(?).
import java.util.*;

class Any {
    public static void print(List<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }
        System.out.println();
    }
}

public class wildcard {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("A", "B");

        Any.print(nums);
        Any.print(words);
    }
}
