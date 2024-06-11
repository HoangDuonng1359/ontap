package Design_pattern.Creational_pattern.factoryMethod;

// Lớp cơ sở ShapeFactory khai báo một phương thức factory method
// Mọi lớp con của ShapeFactory cần triển khai phương thức này để tạo đối tượng hình học cụ thể.
public abstract class ShapeFactory {

    // Factory Method: Một phương thức abstract để tạo đối tượng hình học.
    public abstract Shape createShape();
}
