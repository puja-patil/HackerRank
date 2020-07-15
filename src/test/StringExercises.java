package test;

public class StringExercises {
	public static void main(String[] args) {
		String s1 = "s1";
		String test = new String("s1");
		s1.concat("234");
		System.out.println(s1);
		StringBuilder sbl = new StringBuilder("sbl");
		sbl.append("1234");
		System.out.println(sbl);
		StringBuffer sbf = new StringBuffer("sbf");
		changeSbf(sbf);
		System.out.println(sbf);
	}
	
	public static void changeSbf(StringBuffer sbf) {
		sbf.append(" more");
		sbf.replace(0,1, "o");
		sbf = null;
	}
}
