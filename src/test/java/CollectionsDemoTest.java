import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class CollectionsDemoTest {

    @Test
    void countStringsStartWith() {
        ArrayList<String> ar = new ArrayList<>();
        char d = 'Д';
        ar.add("Дима");
        ar.add("Коля");
        ar.add("Данил");
        System.out.println(CollectionsDemo.countStringsStartWith(ar, d));
    }
}