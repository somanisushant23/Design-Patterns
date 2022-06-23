package singleton.serailizationissue;

import java.io.Serializable;

/**
 * Singleton2 class Serializable marker interface (Interface with no methods).
 * These interfaces are used to mark special operation by JVM.
 * Here JVM marks this class as serializable.
 *
 * Serializable is used to convert object to binary code for network transmission
 * or write data to a file.
 *
 * Here the object is created as
 * public static Singleton2 sInstance = new Singleton2();
 * Note that passing any parameter in constructor is difficult here.
 */
public class Singleton2 implements Serializable {

    public static Singleton2 sInstance = new Singleton2();

    private Singleton2(){

    }
}
