package up_down_casting;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        // => nhìn nhận dog là animal => up casting
        animal.speak();
        // animal.eat(); => không thể dùng phương thức riêng của Dog
        animal.sleep(); // phương thức sleep của Dog được thừa kế từ animal
        if (animal instanceof Animal) {
            Dog dog = (Dog) animal;
            System.out.println(dog.getInfo());
            dog.eat();
        }
    }
}
