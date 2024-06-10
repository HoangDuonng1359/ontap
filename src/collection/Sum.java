package collection;

public class Sum {
    public static   <T extends Number> double sumArray(T[] listT){
        double sum = 0;
        for(T t : listT){
            sum+=t.doubleValue();
        }
        return sum;
    }
}
