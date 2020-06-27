package programmingTest;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "#@$#@%$#@^@$%^ tets 4985904";
		//Regular Expression [^a-zA-Z0-9]	
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
