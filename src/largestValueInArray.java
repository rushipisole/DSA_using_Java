
public class largestValueInArray {
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 199, 6, 7, 8, 9};
        int ans = getLargest(number);
        System.out.println("The largest is: " + ans);
    }

    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }
}
