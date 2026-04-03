package methods_and_functions;

public class fibonacci {
    public static int fibonacciSeries(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacciSeries(n));
    }
}
