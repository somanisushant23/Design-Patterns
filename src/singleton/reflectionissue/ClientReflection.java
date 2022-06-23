package singleton.reflectionissue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Below code represents the way to destroy singleton
 * property of Singleton1 class using Java reflection
 */
public class ClientReflection {

    public void getReflectionIssues(){
        Singleton1 instance1 = Singleton1.sInstance;
        Singleton1 instance2 = null;

        Constructor[] constructors = Singleton1.class.getDeclaredConstructors();
        for (Constructor ctr: constructors){
            ctr.setAccessible(true);
            try {
                instance2 = (Singleton1) ctr.newInstance();//downcast from Object to Singleton1 instance type
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            break;
        }

        //Below output will print different hashcodes
        System.out.println("Instance1 hashcode is "+instance1.hashCode());
        System.out.println("Instance2 hashcode is "+instance2.hashCode());
    }
}
