package abstract_;

public class concrete_class extends abstarct_class{
	
	
	public void m1() {
		
		System.out.println("house");
	}
	public void m2() {
		
		System.out.println("car");
	}
	
	public void m3() {
		
		System.out.println("money");
	}

	
	public static void main(String[] args) {
		
		concrete_class mdm=new concrete_class();
		
		mdm.m1();
		mdm.m2();
		mdm.m3();
	}
}
