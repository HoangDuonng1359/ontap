package Design_pattern.Creational_pattern.factoryMethod;


public class Main {

    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw(); // Output: Drawing a Circle

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw(); // Output: Drawing a Rectangle
    }
}
