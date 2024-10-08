public class reverseTheString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();


    }

    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;

        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }
    }
}
