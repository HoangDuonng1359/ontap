package singleton;

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){ // ngăn cho không khởi tạo đối tượng mới từ bên ngoài

    }
    public static Singleton getInstance(){ // nhận đối tượng thông qua static method
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
