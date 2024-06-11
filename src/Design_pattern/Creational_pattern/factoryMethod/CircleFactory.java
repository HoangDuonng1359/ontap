package Design_pattern.Creational_pattern.factoryMethod;

// Lớp CircleFactory là một lớp con của ShapeFactory
public class CircleFactory extends ShapeFactory {

    // Triển khai factory method để tạo đối tượng Circle.
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
