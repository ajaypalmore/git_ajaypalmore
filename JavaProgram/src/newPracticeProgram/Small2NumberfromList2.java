package newPracticeProgram;

public class Small2NumberfromList2 {
	
	public static void main(String[] args) {
	
	int num[] = {23,45,45,67,78,-1,89};
	int len = num.length;
	int Small1=num[0],Small2=num[0];

	for(int i=0;i<len;i++)
	{
		if(Small1>num[i])
		{
			Small2=Small1;
			Small1=num[i];
		}
		else if(Small2>num[i])
		{
			Small2=num[i];
		}
	}
		
	System.out.println("Small1: " +Small1);
	System.out.println("Small2: " +Small2);
}
}
