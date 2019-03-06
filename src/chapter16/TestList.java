package chapter16;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        Folk folk1 = new Folk();
        folk1.setAge(12);
        Folk folk2 = new Folk();
        folk2.setAge(10);
        List<Folk> list = new ArrayList<>();
        list.add(folk1);
        list.add(folk2);
        System.err.println(list);
    }
}
