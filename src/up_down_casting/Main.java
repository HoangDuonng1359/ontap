package up_down_casting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        // => nhìn nhận dog là animal => up casting
        animal.speak();
        // animal.eat(); => không thể dùng phương thức riêng của Dog
        animal.sleep(); // phương thức sleep của Dog được thừa kế từ animal

        Dog dog = (Dog) animal;
        System.out.println(dog.getInfo());
        dog.eat();
    }
}
