package newPracticeProgram;

import java.text.NumberFormat;

public class ConvertNumberIntoWords {
public static String Convert(int num)
{
	
	final String [] tens =  {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };
	final String [] units  = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };
	
	if (num<0)
	{
		return "Minus"+Convert(-num);
	}
	if (num<20)
	{
		return units[num];
	}
	if (num<100)
	{
		return tens[num/10]  + ((num % 10 != 0) ? " " : "") +  units[num%10];
	}
	
	if (num<1000)
	{
		return units[num/100]+ " Hundred" + ((num % 100 != 0) ? " " : "") +  Convert(num%100);
	}
	
	if (num<100000)
	{
		return Convert(num/1000) + " Thousand" + Convert(num%1000);
	}
	
	if (num<10000000)
	{
		return Convert(num/100000) + " Lakh"+ Convert(num%100000);
	}
	
	if (num<1000000000)
	{
		return Convert(num/10000000) + " Cores" + Convert(num%10000000);
	}
	return null;

}
	public static void main(String[] args) {
		int n;

		n = 975678957;
		System.out.println(NumberFormat.getInstance().format(n) + " ='"+Convert(n)+"'");

	}

}
