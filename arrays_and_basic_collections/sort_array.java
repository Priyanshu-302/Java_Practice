package arrays_and_basic_collections;

import java.util.ArrayList;

public class sort_array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(5);

        list.sort(null);

        System.out.println(list);
    }
}
