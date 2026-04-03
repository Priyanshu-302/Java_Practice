package arrays_and_basic_collections;

public class count_frequency_of_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2};
        int key = 2;

        int cnt = 0;
        for (int i : arr) {
            if (i == key) cnt++;
        }

        System.out.println(cnt);
    }
}
