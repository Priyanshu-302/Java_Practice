package essential_java_syntax;

import java.util.Scanner;

public class largest_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        sc.close();
    }
}
