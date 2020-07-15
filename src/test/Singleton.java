package test;

public class Singleton {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getSingletonClass();
		SingletonClass s2 = SingletonClass.getSingletonClass();
		System.out.println(s1+" "+s2);
	}
}

class SingletonClass{
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	private static SingletonClass s = new SingletonClass();
	
	public static SingletonClass getSingletonClass() {
		return s;
	}
}