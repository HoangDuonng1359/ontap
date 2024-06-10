package abstract_and_interface;

public class Cat implements Animal_interface {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void speak() {
        System.out.println("meo meo");
    }
}
