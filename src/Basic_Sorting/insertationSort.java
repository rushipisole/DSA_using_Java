package Basic_Sorting;

public class insertationSort {
    public static void main(String[] args) {
        int arr[] = {6, 2, 4, 5, 1, 9};
        insertationSort(arr);
        insertationSortPrint(arr);
    }

    public static void insertationSortPrint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertationSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            //Finf out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            //Insertion
            arr[prev + 1] = curr;
        }
    }
}
