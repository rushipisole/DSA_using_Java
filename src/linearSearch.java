public class linearSearch {
    public static void main(String[] args) {
//        int number[] = {2, 3, 4, 5, 6, 7, 8, 9};
        String menu[] = {"dosa", "pohe", "idli", "upma"};
        String key = "dosa";

        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Number at index: " + index);
        }
    }

    public static int linearSearch(String number[], String key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

