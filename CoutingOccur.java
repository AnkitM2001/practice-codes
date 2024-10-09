import java.util.*;

public class CoutingOccur {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the number you want to count: ");
		int c = sc.nextInt();
		
		sc.close();
		
		int count = 0;
		
		while(n>0) {
			int rem =n%10;
			if(rem == c) {
				count++;
			}
			n=n/10;
		}
		System.out.println(c + " occurs " + count + " times ");

	}

}
