package singleton.serailizationissue;

import java.io.*;

/**
 * When we serialize Singleton2 instance and de-serialize it,
 * a new object is created and thus singleton property can be violated.
 *
 * To overcome serialization issue, developer can use private readResolve()
 * method to prevent multiple instance.
 * Singleton3 depicts that use-case.
 */
public class ClientSerialization {

    public void getSerializationIssues(){
        Singleton2 sInstance1 = Singleton2.sInstance;
        Singleton2 sInstance2 = null;

        try {
            //Serialize sInstance1
            ObjectOutput ot = new ObjectOutputStream(new FileOutputStream("file.text"));
            ot.writeObject(sInstance1);
            ot.close();

            //deserialize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            sInstance2 = (Singleton2)in.readObject();
            in.close();

            //below hashcodes will be different
            System.out.println("Instance1 hashcode is "+sInstance1.hashCode());
            System.out.println("Instance2 hashcode is "+sInstance2.hashCode());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void checkReadResolveFix(){
        Singleton3 sInstance1 = Singleton3.sInstance;
        Singleton3 sInstance2 = null;

        try{
            //Serialize sInstance1
            ObjectOutput ot = new ObjectOutputStream(new FileOutputStream("file.text"));
            ot.writeObject(sInstance1);
            ot.close();

            //deserialize from file to object
            //it will also call readResolve() method in Singleton3 class
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            sInstance2 = (Singleton3)in.readObject();
            in.close();

            //below hashcodes will be SAME
            System.out.println("Instance1 hashcode is "+sInstance1.hashCode());
            System.out.println("Instance2 hashcode is "+sInstance2.hashCode());
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
