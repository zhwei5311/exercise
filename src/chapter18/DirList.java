package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File path = new File("C:\\Word");
        String[] list;
        if(args.length == 0) {
            list = path.list();
        } else {
            System.out.println(args[0]);
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list) {
            System.err.println(dirItem);
        }
    }
}
