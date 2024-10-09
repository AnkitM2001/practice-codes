import java.util.*;
public class anagram {
	
	public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println("Enter the value of s : ");
		String t = sc.nextLine();
		System.out.println("Enter the value of t : ");
		sc.close();
		
		boolean result = isAnagram(s, t);
        System.out.println(result);
	}

}
