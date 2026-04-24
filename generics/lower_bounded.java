// Write a method to add integers into a list using ? super Integer
import java.util.*;

class Add {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}

public class lower_bounded {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Add.addNumbers(list);
        System.out.println(list);
    }
}
