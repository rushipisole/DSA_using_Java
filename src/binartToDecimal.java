public class binartToDecimal {
    public static void main(String[] args) {

        binaryNumber(101);
    }

    public static void binaryNumber(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decimalNumber = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimalNumber = decimalNumber + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of binary number " + myNum + " = " + decimalNumber);
    }
}
