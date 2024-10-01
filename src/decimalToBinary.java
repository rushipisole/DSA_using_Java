public class decimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(5);
    }

    public static void decimalToBinary(int n) {
        int myNum = n;
        int pow = 0;
        int binNumber = 0;

        while (n > 0) {
            int rem = n % 2;
            binNumber = binNumber + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("the decimal number of " + myNum + " is: " + binNumber);
    }
}

