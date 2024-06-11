package Design_pattern.Creational_pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,"pet");
        Animal animal1 = animal.clone();
        System.out.println(animal1);
        System.out.println(animal);
        // ta được 2 đối tượng giống hệt nhau
    }
}
