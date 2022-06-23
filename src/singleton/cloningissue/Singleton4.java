package singleton.cloningissue;


public class Singleton4 extends Singleton4Super{

    public static Singleton4 sInstance = new Singleton4();

    private Singleton4(){

    }

    /**
     * In order to prevent cloning, either return
     * sInstance in the method or throw CloneNotSupportedException explicitly.
     * @return super.clone()
     * @throws CloneNotSupportedException can be thrown
     */
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
        //return sInstance;
        //throw new CloneNotSupportedException();
    }
}
