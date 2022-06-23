package singleton.cloningissue;

/**
 * Cloneable is a marker interface
 * These interfaces are used to mark special operation by JVM.
 * Here JVM marks this class as Cloneable.
 */
public class Singleton4Super implements Cloneable{

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
