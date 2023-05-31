package abstractclassandinheritance;

public class Cache {
private static Cache instance;
private Cache() {
	
}
public static synchronized Cache getInstance() {
	if( instance == null) {
		instance = new Cache();
	}
	return instance;
	}
public Object getData(String key) {
	return null;
	
}
}