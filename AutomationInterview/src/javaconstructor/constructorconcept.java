package javaconstructor;

public class constructorconcept {
	
	constructorconcept ()
	{
		System.out.println(" Default constructor");
	}
	constructorconcept (int i )
	{
		System.out.println("Parameterized constructor");
		System.out.println("Variable :::>>>>" +i);
	}
	constructorconcept (int i, int j)
	{
		System.out.println("Dual Parameterized constructor");
		System.out.println("Variable :::>>>>" +i);
		System.out.println("Variable :::>>>>" +j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorconcept obj = new constructorconcept(20,30);
		System.out.println("##########################");
		bclass bc = new bclass();
		System.out.println("##########################"+bc.getClass());
		

	}

}
