import java.util.*;
public class Flipcoinpercentage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Write how many times you want to flip the coin : ");
		int totalFlip = sc.nextInt();
		int hF = 0;
		int tF = 0;
		double flip = 0;
		if (totalFlip<=0)
		{
			System.out.println("Enter the value greater than 0 ");
		}
			else
			{
			for (int i = 1; i <= totalFlip; i++) 
				flip = Math.floor(Math.random()*10)%2;
				if (flip<0.5)
				{
					hF++;
					
				}
		
			
				else 
				{
					tF++;
					
				}
			}
			
		
	
		
		double headPercent=(hF*100)/totalFlip;
		double tailPercent=(tF*100)/totalFlip;
		System.out.println("Head flip percentage is : "+headPercent);
		System.out.println("Tail flip percentage is : "+tailPercent);
	}

}
