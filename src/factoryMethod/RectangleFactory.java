package factoryMethod;

// Lớp RectangleFactory cũng là một lớp con của ShapeFactory
public class RectangleFactory extends ShapeFactory {

    // Triển khai factory method để tạo đối tượng Rectangle.
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
