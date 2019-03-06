package chapter16;

import java.util.ArrayList;
import java.util.List;

public class TestFinally {
    public static int num = 1;

    public static void main(String[] args) {
        System.out.println(test());//1
        System.out.println(test1());
        int result;
        result = test2();
        System.out.println(result);//输出结果为1003
        System.out.println(num);//输出结果为1001
    }

    private static int test() {
        int i = 0;
        try {
            i++;
            return i;
        } finally {
            i++;
//            return i;
        }
    }

    private static List<String> test1() {
        List<String> list = new ArrayList<>();
        try {
            list.add("A");
            return list;
        } finally {
            list.add("B");
        }
    }


    private static int test2() {

        try {
            int b = 4 / 0;
            return num = num + 1000;
        } catch (Exception e) {
            return num = num + 1000;
        } finally {
            return num + 2;
        }
    }
}
