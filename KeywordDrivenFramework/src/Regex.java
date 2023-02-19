import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("govind", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("GOVIND maddala");
		boolean foundWord = matcher.find();
		System.out.println(foundWord);
		
		
		
	}
}
