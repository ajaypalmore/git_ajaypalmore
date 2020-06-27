package newPracticeProgram;

public class ReverseStringWordbyWord {

	public static void main(String[] args) {
		
		String str = "Welcome to the world of reverse string";
		String word[] = str.split("\\s");
		int len = word.length;
		String temp= "";
		for(int i=len-1;i>=0;i--)
		{
			temp = temp + word[i] +" ";
		}
		
		System.out.println("ReverseStringWordbyWord :::"+temp);
	}

}
