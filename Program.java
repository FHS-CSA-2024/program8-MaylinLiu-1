//import stuff here
import java.util.Scanner;

//Your code here
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Original numbers are " + num1 + " and " + num2);
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(difference);
        
        int max;
        int min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
        System.out.println("Absolute value = " + distance);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        
        scanner.close();
    }
}

// Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13
*/
