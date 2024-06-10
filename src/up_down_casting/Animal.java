package up_down_casting;

public class Animal {
    private int weight;
    private int age;

    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public Animal(){
        this.weight = 10;
        this.age = 1;
    }

    public void speak(){
        System.out.println("Animal is speaking");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public String getInfo(){
        return "I'm Animal";
    }
}
