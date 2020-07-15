package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Test implements Cloneable{
	static int i = 1;
	
	static int call() { return 0;}
	

	void test() {
		System.out.println("test" + this.i + ""+call());
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		Test test = new Test();
		test.test();
		Test t2 =(Test) test.clone();
		t2.test();
		ArrayList<Integer> testarr = new ArrayList<Integer>();
		LinkedList<Integer> testLL = new LinkedList<Integer>();
		testLL.add(1);
		testLL.add(2);
		for (Iterator iterator = testLL.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(iterator.toString());
		}
	}

}
