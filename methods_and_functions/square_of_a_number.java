package methods_and_functions;

import java.util.Scanner;

public class square_of_a_number {
    public static int square(int n) {
        return n *n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(square(n));
        sc.close();
    }
}
