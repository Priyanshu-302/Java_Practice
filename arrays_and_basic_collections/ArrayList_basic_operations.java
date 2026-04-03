package arrays_and_basic_collections;

import java.util.ArrayList;

public class ArrayList_basic_operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.remove(0); // --> Removes the element at index 0

        list.remove(Integer.valueOf(0)); // --> Removes the element with value 0

        System.out.println(list);
    }
}
