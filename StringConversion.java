package practice_projects;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class StringConversion {
	 public static void main(String[] args) {
	        // Creating a String
	        String originalString = "Hello, World!";

	        // Converting String to StringBuffer
	        StringBuffer stringBuffer = new StringBuffer(originalString);

	        // Converting String to StringBuilder
	        StringBuilder stringBuilder = new StringBuilder(originalString);

	        // Displaying the original string
	        System.out.println("Original String: " + originalString);

	        // Displaying the StringBuffer
	        System.out.println("StringBuffer: " + stringBuffer);

	        // Displaying the StringBuilder
	        System.out.println("StringBuilder: " + stringBuilder);
	    }

}
