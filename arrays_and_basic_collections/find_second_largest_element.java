package arrays_and_basic_collections;

public class find_second_largest_element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }

        System.out.println(secondLargest);
    }
}
