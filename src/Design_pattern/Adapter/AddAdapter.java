package Design_pattern.Adapter;
public class AddAdapter implements AddTarget {
    private double a;
    private double b;
    public void translate(String input){
        String[] parts = input.split("\\+");

        // Kiểm tra nếu có đủ hai phần tử sau khi tách
        if (parts.length == 2) {
            this.a = Double.parseDouble(parts[0]);
            this.b = Double.parseDouble(parts[1]);

        }
    }
    @Override
    public double add(double a, double b) {
        return a+b;
    }
}
