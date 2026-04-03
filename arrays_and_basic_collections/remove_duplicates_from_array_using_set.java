package arrays_and_basic_collections;

import java.util.HashSet;

public class remove_duplicates_from_array_using_set {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        System.out.println(set);
    }
}
