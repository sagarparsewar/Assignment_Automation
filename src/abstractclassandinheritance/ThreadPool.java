package abstractclassandinheritance;

public class ThreadPool {
	private static ThreadPool instance;
	private ThreadPool  () {
		
	}
	public static synchronized ThreadPool getInstance() {
		if (instance == null) {
			instance =  new ThreadPool();
		}
		return instance;
		
	}
	public void excute (Runnable task) {
		
	}

}
