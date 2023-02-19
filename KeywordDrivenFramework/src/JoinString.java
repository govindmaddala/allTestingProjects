import java.util.ArrayList;

public class JoinString {

	public static void main(String[] args) {
		
//		String[] names = {"govind","maddala"};
//		
//		String fullName = String.join(" ", names);
//		System.out.println(fullName);
		
//		String line = "R1 with Awign";
//		String[] words = line.split(" ");
//		String reverseWord = "";
//		for(String word: words) {
//			reverseWord = word+"+"+reverseWord;
//		}
//		System.out.println(reverseWord);
//		StringBuffer wordBuffer = new StringBuffer(reverseWord);
//		int len = wordBuffer.length();
//		wordBuffer.deleteCharAt(len-1);
//		System.out.println(wordBuffer);
		
		String a = "10";
		int aNum = Integer.parseInt(a);
		System.out.println(aNum+aNum);
		
		String aStr = String.valueOf(aNum);
		System.out.println(aStr+aStr);

	}

}
