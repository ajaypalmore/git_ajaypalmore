package mytestProgram;

public class reversenumber {

	public static void main(String[] args) {
		int number = 123456789;
		int rev = 0;
		String str = "madam";
		int len = str.length();
		String revstr = "";
		String str1 = "Hello";
		String str2 = "Team";
		String a = "##^#^^^%@&^^&gfhfkjhl%$^&&$&$&&";
		
		 while(number!=0)
		 {
			 rev = rev*10 + number%10;
			 number = number/10;
		 }
		 
		 for(int i =len-1;i>=0;i--)
		 {
			 revstr= revstr+str.charAt(i);
		 }
		 System.out.println("Reverse String>>>>>>>::: "+revstr);
		 
		 StringBuffer sb = new StringBuffer(str);
		 
		 System.out.println("Reverse String Buffer >>>>>>>::: "+sb.reverse());
		 
		 str1 = str1+str2;
		 str2 = str1.substring(0,str1.length()-str2.length());
		 str1 = str1.substring(str2.length());
		 
		 System.out.println("Str1 >>>>>>>::: "+str1);
		 System.out.println("Str1 >>>>>>>::: "+str2);
		 
		 a= a.replaceAll("[^a-zA-Z0-9]","");
		 System.out.println("String >>>>>>>::: "+ a);
		 
		 int num[] = {0,1,2,4,5,6,7,8,9};
		 
		 int sum = 0;
		 int sum1= 0;
		 
		 for(int j = 0 ; j<num.length;j++)
		 {
			 sum= sum+num[j];
		 }
		 System.out.println("Sum:::"+sum);
		 for (int k =0; k<= 9;k++)
		 {
			 sum1 = sum1+k;
		 }
		 
		 System.out.println("Total >>>>>>>::: "+sum1);
		 System.out.println("Missing >>>>>>>::: "+ (sum1-sum));
	}

}
