package JavaPractice;

public class NullConceptJava {
	static Object obj;
	static String str;
	static NullConceptJava cop;

	public static void main(String[] args) {
//1. case sensitive
		//Object obj = null;
//2 . Default vaule of object is null
		System.out.println(obj);
		System.out.println(str);
		System.out.println(cop);
//3. 
//		Integer i = null;
//		int j= i;
//		
		
//4. Instanceof 
		Integer i = null;
		Integer j= 10;
		System.out.println(j instanceof Integer );
		System.out.println(i instanceof Integer );
		
//5. static vs Non Static
		NullConceptJava nc= null;
		//nc.add();
		nc.sum();
	
//6. == vs !=
		System.out.println(null == null);
		System.out.println(null != null);
		
//7. 
		String str = null;
		Integer k = null;
		Double di= null;
//8.
		String str1 = (String) null;
		System.out.println("String ......  "+str1+"Ajay");
		//System.out.println("String ......  "+str1.length);
		System.out.println("String ......  "+str1.charAt(0));
	}
	
	public static void sum() {
		System.out.println("SUM......");
	}
	
	public  void add () {
		System.out.println("ADD......");
	}


}
