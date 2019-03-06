package chapter16;

public class Government implements Generator<String> {

    String[] foundation = ("strange women lying in ponds distributing swords is" +
            " no basis for a system of gevernment").split(" ");

    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}
