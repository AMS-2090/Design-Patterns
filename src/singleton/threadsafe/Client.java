package singleton.threadsafe;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.sayHello();
		
		// ask for singleton instance one more time
		Singleton singleton2 = Singleton.getInstance();
		if (singleton == singleton2) {
			System.out.println("There is only one true Singleton!");
		}
	}

}
