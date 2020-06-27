package mytestProgram;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		CallByValue call = new CallByValue();
		System.out.println("Value of A:: "+a);
		System.out.println("Value of b:: "+b);
		call.getadd(a, b);
		
		System.out.println("Value after of A:: "+a);
		System.out.println("Value after of b:: "+b);

	}
	
	public void getadd(int a,int b )
	{
		b = a+b;
		System.out.println("Addition of a and b:: "+b);
	}
	
	

}
