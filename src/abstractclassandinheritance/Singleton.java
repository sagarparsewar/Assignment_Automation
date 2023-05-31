package abstractclassandinheritance;

public class Singleton {
	private static Singleton instance;
	private int value;
	private Singleton() {
		
	}
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
		
	}
	public int getValue() {
		return value;
		
	}
public void setValue(int value) {
	this.value = value;
}
}
