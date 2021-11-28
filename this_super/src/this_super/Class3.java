package this_super;

public class Class3 extends Class2 {
	int a = 20;
	
	void m1(int a) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		m2();
		this.m2();
		super.m2();
	}
	
	void m2() {
		System.out.println("Class3 m2()");
	}

}
