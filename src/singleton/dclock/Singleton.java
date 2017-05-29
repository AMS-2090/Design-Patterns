package singleton.dclock;

/*
 * This Singleton class IS thread safe.
 * A getInstance() has a synchronized block
 * which is invoked only once, when the unique Singleton
 * object is being created, hence it is more efficient than
 * synchronizing entire method.
 * This procedure is called 'double-checked locking'.
 */

public class Singleton {

	private volatile static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		// first check
		if (uniqueInstance == null) {
			// enter into synchronized block
			synchronized (Singleton.class) {
				// second check
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	
	/* other methods */
	
	public void sayHello() {
		System.out.println("Hello there! I am a simple Singleton class.");
	}
	
}
