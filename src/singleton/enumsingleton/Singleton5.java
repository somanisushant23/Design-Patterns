package singleton.enumsingleton;

/**
 * This is the best way to implement a Singleton in java.
 * It can withstand multiple object creation attacks
 * of serialization or reflection.
 *
 *
 * JVM handles the creation and invocation of enum constructors internally.
 * Enums don't share constructor information to the programs so their constructor
 * cannot be accessed via reflection as well.
 */
public enum Singleton5{
    SINSTANCE;

    public void performOperations(){
        System.out.println("Method of Singleton5");
    }
}
