public class checkIfNumberIsPrimeOrNot {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }

    public static boolean isPrime(int n) {
        boolean isPrimes = true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                isPrimes = false;
                break;
            }
        }
        return isPrimes;
    }
}
