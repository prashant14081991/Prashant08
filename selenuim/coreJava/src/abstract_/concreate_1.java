package abstract_;

public class concreate_1 extends example1{
	
	public void m1() {
		
		System.out.println("method m1 running");
	}
	
	public void m2()
	{
	System.out.println("method m2 running");	
	}
	
	public static void main(String[] args) {
		concreate_1 mdm=new concreate_1();
		
		mdm.m1();
		mdm.m2();
		
		
	}
}


