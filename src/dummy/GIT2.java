package dummy;

public class GIT2 extends GIT1{
	
	public void method2()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		
		GIT2 obj= new GIT2();
		obj.Method1();
		obj.method2();

	}

}
