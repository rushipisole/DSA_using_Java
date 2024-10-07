public class linearSearch {
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 10;

        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Number at index: " + index);
        }
    }

    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

