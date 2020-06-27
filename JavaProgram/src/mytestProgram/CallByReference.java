package mytestProgram;

public class CallByReference {
	int data = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CallByReference callRef = new CallByReference();
		System.out.println("Before :::: "+callRef.data);
		callRef.getadd(callRef);
		System.out.println("After :::: "+callRef.data);
		
	}
	
	public void getadd(CallByReference callRef)
	{
		callRef.data= callRef.data +400;
	}

}
