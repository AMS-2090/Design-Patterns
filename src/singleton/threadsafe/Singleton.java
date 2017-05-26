package singleton.threadsafe;


/*
 * This Singleton class IS thread safe.
 * But the getInstance method is invoked in synchronized
 * mode at every time, which is very inefficient. 
 */

public class Singleton {

	private static Singleton uniqueInstance;
	
	/* private constructor */
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	/* other methods */
	
	public void sayHello() {
		System.out.println("Hello there! I am a Singleton class with "
				+ "a synchronized static method.");
	}
	
}

