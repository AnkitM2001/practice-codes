public class ReverseString {
    public static void main(String[] args) {
        String s = "Ankit.Mishra";
        
        // Split the string by dots
        String[] words = s.split("\\.");
        
        StringBuilder reversedString = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(".");
            }
        }
        
        System.out.println(reversedString.toString());
    }
}