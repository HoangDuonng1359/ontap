package up_down_casting;

public class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Gou Gou...");
    }
    public void eat(){
        System.out.println("Dog is eating!!!");
    }
    public String getInfo(){
        return "I'm Dog";
    }
}
