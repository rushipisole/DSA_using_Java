package Basic_Sorting;

import java.util.Arrays;

public class inbuiltSort {
    public static void main(String[] args) {
        int arr[] = {9, 3, 5, 68, 35, 2, 23};
        Arrays.sort(arr);
        inbuiltSortPrint(arr);
    }

    public static void inbuiltSortPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
