package abstract_and_interface;

public interface Animal_interface {
    void eat();
    void speak();
    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}
