package stu24.thread2;

class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		if (instance == null) {
			synchronized ("") {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

public class SingletonTest {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable () {
			@Override
			public void run() {
				System.out.println(Singleton.getInstance());
			}
		};
		
		new Thread(runnable).start();
		new Thread(runnable).start();
		new Thread(runnable).start();
	}
}
