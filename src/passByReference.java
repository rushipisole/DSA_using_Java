import java.util.*;

public class passByReference {
    public static void main(String[] args) {
        int marks[] = {34, 35, 36};
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println();
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}
