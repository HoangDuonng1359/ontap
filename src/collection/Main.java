package collection;

public class Main {
    public static void main(String[] args) {
        Group<Integer> gr = new Group<>();
        gr.d1 = 1;
        gr.d2 = 4;
        gr.d3 = -1;
        System.out.println((Integer)Group.getMax(gr));
        Integer[] list = new Integer[3];
        list[0] = gr.d1;
        list[1] = gr.d2;
        list[2] = gr.d3;
        System.out.println(Sum.sumArray(list));
    }
}
