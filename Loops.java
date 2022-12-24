import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = 10899;
        int lastdigit = 0;

        while (digit > 0) {
            lastdigit = digit % 10;
            System.out.print(lastdigit);
            digit = digit / 10;
        }
        System.out.println(digit);

        System.out.println("****************");
        for (int i = 0; i < 5; i++) {
            System.out.println("Bhavnish");
            i += 2;
        }


        //Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        System.out.print("Enter the numbers: ");
        int a = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum Of Even Numbers up to "+ a +" will be "+evenSum);
        System.out.println("Sum of Odd Numbers up to "+ a +" will be "+oddSum);




        //Write a program to find the factorial of any number entered by the user
        System.out.println("Enter the number: ");
        int x = input.nextInt();
        int fact = 1;

        for(int i = 1; i <= x; i++){
            fact *= i;
        }
        System.out.println(fact);



        //Write a program to print the multiplication table of a number N,entered by the user.
        System.out.println("Enter the number to print the table");
        int w = input.nextInt();

        int multiple = 1;
        for(int i = 1; i <= 10; i++){
            multiple = w * i;
            System.out.println(w+" * "+i+" = "+multiple);
        }



    }
}
