package Windows;

public class Shortcut extends Item{

    @Override
    public double getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "Shortcut{" +
                "name='" + getName() + '\'' +
                '}';
    }

}
