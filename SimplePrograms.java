import java.util.Scanner;

public class SimplePrograms {
    public static void main(String[] args) {
        student s1 = new student("Bhavnish");
        System.out.println(s1.name);


        // Patterns Problems
        for(int i = 1; i <= 10; i++){
            for(int k = 10-1; k >= i; k--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        // Palindrom Strings
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = input.nextLine();

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                System.out.println("Not a Palindrom String");
            }else{
                System.out.println("Palindrom String");
            }
        }

    }
}

class student{
    String name;
    int age;
    student( String name){
        this.name = name;
    }
}