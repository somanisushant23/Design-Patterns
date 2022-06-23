package singleton.reflectionissue;

public class Singleton1 {
    public static Singleton1 sInstance = new Singleton1();

    private Singleton1(){

    }

    public void sampleMethod(){
        System.out.println("Singleton1 class method");
    }
}
