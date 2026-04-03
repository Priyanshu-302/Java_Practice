package methods_and_functions;

public class check_prime {
    public static boolean checkPrime(int n) {
        if (n <= 1) return false;

        boolean isPrime = true;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) return true;

        return false;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(checkPrime(n));
    }
}
