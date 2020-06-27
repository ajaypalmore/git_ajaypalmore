package mytestProgram;



public class Test1 extends Test2 {
	Test1()
	{
		System.out.println("<<<<<<<<<<<Test1>>>>>>>>>>>");
	}
	
	public static void main(String[] args) {
		
	Test1 t1 = new Test1();
	
	String str = "abcde";
	String str1 = "djfhsdgabcfgfdedhfsgjdsfhgjk";
	if (str1.indexOf(str)>-1)
	{
		System.out.println("String Present" + str1.lastIndexOf(str));
	}
	else
	{
		System.out.println("String Not found");
	}
		
}
}