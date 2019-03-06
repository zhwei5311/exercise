package chapter16;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<>(new Government(), 15)
        );
        set.addAll(CollectionData.list(new Government(), 15));
        System.err.println(set);
    }
}
