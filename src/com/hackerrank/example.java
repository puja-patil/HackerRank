package com.hackerrank;

public class example {
	int p;
	int q;
	/*
	 * public static void main(String args[]) { int i[] = { 1 }; change_i(i);
	 * System.out.println(i[0]); System.out.println(i.hashCode()); }
	 * 
	 * public static void change_i(int i[]) { i[0] = 2; i[0] *= 2;
	 * System.out.println(i.hashCode()); }
	 */
	// static int p,q;

	public static void main(String args[]) {
		//int i[] = { 1, 0 };
		Integer y = 9;
		System.out.println(y.intValue());
		example p = new example();
		example q = new example();
		p.p=p.q=0;
		q.p=q.q=1;
		System.out.println("Before " + p.p + " " + p.q);
		swap(p,q);
		System.out.println("After " + q.p+ " " + q.q);

		// change_i(i);
		// System.out.println(i[0]);
	}

	public static void change_i(int i[]) {
		System.out.println(i.hashCode());
		int j[] = { 2 };
		i = j;
		System.out.println("j" + j.hashCode());
		System.out.println("i" + i.hashCode());

	}

	public static void swap(example p,example q) {
		/*
		 * System.out.println(i instanceof Object); int k =i[0]; i[0]=i[1]; i[1]=k;
		 */

		example e = p;
		p=q;
		q=e;
		// System.out.println(p.hashCode());
	}
}
