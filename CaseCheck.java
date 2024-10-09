import java.util.*;

public class CaseCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the alphabet: ");
		char ch = sc.next().trim().charAt(0);
		
		sc.close();
		
		if(ch>= 'a' && ch<= 'z') {
			System.out.println("Lowercase");
		}
		
		else {
			System.out.println("Uppercase");
		}

	}

}
