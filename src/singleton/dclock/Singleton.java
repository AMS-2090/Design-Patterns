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

	/*
	 * 'volatile' keyword is needed to ensure that every value change
	 * of a volatile variable, made by one thread, will be immediately
	 * written into main memory (not just into CPU cache of this thread).
	 * Main memory is shared between threads, so another thread can read
	 * the most recent value of the variable.
	 */
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
