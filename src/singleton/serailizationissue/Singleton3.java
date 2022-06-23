package singleton.serailizationissue;

import java.io.Serializable;

/**
 * Singleton3 class is a Serializable class because it implements
 * marker interface serializable.
 *
 * It has a method called readResolve(), which protects to create
 * new instance of singleton class while de-serializing a serialized instance.
 *
 * readResolve method is called when ObjectInputStream has read an object from the
 * stream and is preparing to return it to the caller. ObjectInputStream checks whether
 * the class of the object defines the readResolve method. If the method is defined,
 * the readResolve method is called to allow the object in the stream to designate the object to be returned.
 */
public class Singleton3 implements Serializable {

    public static Singleton3 sInstance = new Singleton3();

    private Singleton3(){

    }

    /**
     * this method is called when ObjectInputStream
     * is deserializing a serialized object.
     * @return the already created object of Singleton3 class
     * and thus avoid a new instance of Singleton3 class
     */
    private Object readResolve(){
        return sInstance;
    }
}
