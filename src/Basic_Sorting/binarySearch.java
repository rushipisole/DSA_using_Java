package Basic_Sorting;

public class binarySearch {
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 6;

        int ans = binarySearch(number, key);

        System.out.println("The Index of value is: " + ans);
    }

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
