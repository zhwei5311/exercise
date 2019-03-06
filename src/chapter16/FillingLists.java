package chapter16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.err.println(list);
        Collections.fill(list, new StringAddress("World!"));
        System.err.println(list);
    }
}
