import java.util.*;

public class ReverseWordOfString {

    public static String reverseWords(String input) {
        
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        
        return reversedString.toString().trim();
    }
    
    public static void main(String[] args) {
    	String input = "Hello Vaibhav! Welcome to Bridgelabz";
    	String output = reverseWords(input);
    	System.out.println(output);
    }

    
}