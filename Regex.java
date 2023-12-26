package practice_projects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	 public static void main(String[] args) {
	        // Example 1: Matching a specific pattern for an email address
	        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	        String email1 = "user@example.com";
	        String email2 = "invalid-email";

	        System.out.println("Example 1:");
	        System.out.println("Email 1 is valid: " + checkPattern(email1, emailPattern));
	        System.out.println("Email 2 is valid: " + checkPattern(email2, emailPattern));

	        // Example 2: Matching a pattern for a simple date (DD-MM-YYYY)
	        String datePattern = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4})$";
	        String date1 = "25-12-2022";
	        String date2 = "31-02-2023";

	        System.out.println("\nExample 2:");
	        System.out.println("Date 1 is valid: " + checkPattern(date1, datePattern));
	        System.out.println("Date 2 is valid: " + checkPattern(date2, datePattern));
	    }

	    private static boolean checkPattern(String input, String regex) {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        return matcher.matches();
	    }

}
