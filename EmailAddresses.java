package main;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddresses {
	public static ArrayList find(String inputString) {
		ArrayList result = new ArrayList<String>();
		Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(inputString);
		while (m.find()) {
			String email = m.group();
			System.out.println(email);
			result.add(email);
		}
		
		return result;
	}
}
