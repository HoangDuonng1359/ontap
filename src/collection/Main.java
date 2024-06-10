package collection;

public class Main {
    public static void main(String[] args) {
        Group<Integer> gr = new Group<>();
        gr.d1 = 1;
        gr.d2 = 4;
        gr.d3 = -1;
        System.out.println((Integer)Group.getMax(gr));
    }
}
