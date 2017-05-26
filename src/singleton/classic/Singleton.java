package singleton.classic;

/*
 * This Singleton class is not thread safe.
 * There is a possibility of creating another,
 * different Singleton object for a second thread.
 */

public class Singleton {

	private static Singleton uniqueInstance;
	
	/* private constructor */
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	/* other methods */
	
	public void sayHello() {
		System.out.println("Hello there! I am a simple Singleton class.");
	}
	
}
