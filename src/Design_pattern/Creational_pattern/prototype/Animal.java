package Design_pattern.Creational_pattern.prototype;

public class Animal implements Animal_prototype {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Animal clone(){
        return new Animal(this.age,this.name);
    }
}
