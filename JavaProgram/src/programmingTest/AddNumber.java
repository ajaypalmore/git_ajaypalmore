package programmingTest;

public class AddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 5000;
		int iTotal=0;
	for (int i=1;i<=65;i++)
	{
		iNum = iNum + 1000;
		System.out.println(" Incremental Number ===========>>>>>>>>>>"+ iNum);
		iTotal = iTotal + iNum;
		//System.out.println("Incremental Total = "+ iTotal);
	}
	System.out.println("========= OverAll Total ======= " +iTotal);
	}

}