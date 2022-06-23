package singleton.cloningissue;

public class ClientCloning {

    public void checkCloningIssues(){
        try {
            Singleton4 sInstance1 = Singleton4.sInstance;
            Singleton4 sInstance2 = (Singleton4) sInstance1.clone();
            System.out.println("Instance1 hashcode is "+sInstance1.hashCode());
            System.out.println("Instance2 hashcode is "+sInstance2.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
