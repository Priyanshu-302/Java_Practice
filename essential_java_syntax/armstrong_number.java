package essential_java_syntax;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
