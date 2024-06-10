package collection;

public class Group <T>{
    public T d1;
    public T d2;
    public T d3;
    public static <T extends Comparable<T>> T getMax(Group<T> group) {
        T max = group.d1;
        if (group.d2.compareTo(max) > 0) {
            max = group.d2;
        }
        if (group.d3.compareTo(max) > 0) {
            max = group.d3;
        }
        return max;
    }
}
