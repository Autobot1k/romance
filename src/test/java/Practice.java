import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    @Test
    public void test() {
        String phrase = "Add something to the list";
        List<String> list = new ArrayList<>(Arrays.asList("banana", "milk", "eggs", phrase));
        list.add("melon");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            String element = list.get(i);
            System.out.println(i + " iteration");
            continue;

        }
    }
}
