package Oops;

public class Implementation_Class implements Interface_1 {

	@Override
	public void m1() {
		System.out.println("Implemented method m1");
		
	}

	@Override
	public void m2() {
		
		System.out.println("Implemented method m2");
	}
	public static void main(String[] args) {
		
		Implementation_Class ic=new Implementation_Class();
		ic.m1();
		ic.m2();
		
	}

}
