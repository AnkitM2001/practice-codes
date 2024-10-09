import java.util.*;

public class LineComparison {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter coordinates for the first line (x1, y1, x2, y2): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        
        System.out.println("Enter coordinates for the second line (x3, y3, x4, y4): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        
        
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        
        
        System.out.println("Length of first line: " + length1);
        System.out.println("Length of second line: " + length2);
        
        if (length1 > length2) {
            System.out.println("First line is longer.");
            double midX = (x1 + x2) / 2;
            double midY = (y1 + y2) / 2;
            System.out.println("Midpoint of the longer line: (" + midX + ", " + midY + ")");
        } else if (length2 > length1) {
            System.out.println("Second line is longer.");
            double midX = (x3 + x4) / 2;
            double midY = (y3 + y4) / 2;
            System.out.println("Midpoint of the longer line: (" + midX + ", " + midY + ")");
        } else {
            System.out.println("Both lines are equal in length.");
        }
        
        sc.close();
    }
}
