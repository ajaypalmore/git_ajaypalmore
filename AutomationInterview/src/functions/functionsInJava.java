package functions;

public class functionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functionsInJava obj = new functionsInJava();
		obj.test();
		System.out.println("Return from method:::>>>>"+obj.sum());
		System.out.println("Return from method:::>>>>"+obj.sendMail());
		double result = obj.div(50, 4);
		System.out.println("Result of Div method >>> "+result);
	}

	public void test () {
		System.out.println("Default function without return statement");
	}
	public int sum () {
		System.out.println("SUM Method");
		int i= 10;
		int j = 20;
		int d = i+j;
		return d;

	}
	public double div(int a, int b) {
		System.out.println("Dev Method");
		double div = a/b;
		return div;
	}
	public String sendMail () {
		System.out.println("SENDMAIL Method");
		String s = "Selenium";
		int j = 20;
		String  d = s+j;
		return d;

	}
}
