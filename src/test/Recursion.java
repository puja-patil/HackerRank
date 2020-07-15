package test;

public class Recursion {

	public static void recursiveFunction(int i) {
		System.out.println(i);
		if (i < 1) {
			return;
		} else {
			System.out.println("bef-"+i);
			recursiveFunction(i - 1);
			System.out.println("aft-"+i);
			return;
		}
	}

	public static void main(String[] args) {
		recursiveFunction(5);
	}

}
