import java.util.ArrayList;

public class CollectionsDemo {
    public static int countStringsStartWith(ArrayList<String> list, char start) {
        int count = 0;
        for (String s : list) {
            if (s.charAt(0) == start) {
                count++;
            }
        }
        return count;
    }
}
