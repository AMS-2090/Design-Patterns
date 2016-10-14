package duck;

public class DuckModel extends Duck {

	public DuckModel() {
		flyInterface = new NotFlyer();
		quackInterface = new Quacker();
	}
	
	public void show() {
		System.out.println("I am a Duck Model!");
	}

}
