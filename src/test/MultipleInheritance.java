package test;

public class MultipleInheritance implements A,B {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName());
	}
	
	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.a();
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass());
	}

}

interface A{
	public void a();
}
interface B{
	public void b();
}