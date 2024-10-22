package Basic_Sorting;

public class bubbleSort {
    private static int turn;

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 6, 5, 3};
        bubbleSort(arr);
        bubbleSortPrint(arr);
    }

    public static void bubbleSortPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
