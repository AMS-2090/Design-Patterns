package singleton.staticInit;


/*
 * This Singleton class IS thread safe
 * because an unique instance is created ahead of time,
 * right after class is loaded.
 * It exists in memory, although it might never be used at all.
 */

public class Singleton {

	private static Singleton uniqueInstance = new Singleton();
	
	/* private constructor */
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		return uniqueInstance;
	}
	
	/* other methods */
	
	public void sayHello() {
		System.out.println("Hello there! I am a statically initialized Singleton class.");
	}
	
}