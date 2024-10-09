import java.util.*;

public class ReverseEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        
        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of even numbers: " + average);
        } else {
            System.out.println("No even numbers in the array.");
        }
        
        sc.close();
    }
}
