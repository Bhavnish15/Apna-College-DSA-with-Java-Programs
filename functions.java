public class functions {

    public static int fact(int n) {
        int f = 1;
        for(int i = 1; i < n; i++){
            f *= i;
        }
        return f;
    }

    public static void binaryToDecimal(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of "+mynum+" = "+decNum);
    }



public static void decimalToBinary(int n) {
        int mynum = n;
    int pow = 0;
    int binNum = 0;
    while (n > 0) {
        int rem = n % 2;
        binNum = (int)(binNum +(rem * Math.pow(10, pow)));
        pow++;
        n = n / 2;
    }
    System.out.println("Binary of "+ mynum +" is "+binNum);
}

public static int Avg(int a) {
    int result = 0;
    int average = 0;
    for (int i = 1; i <= a; i++) {
        result += i;
        average = result / a;
    }
    return average;
}

public static boolean isEven(int a) {
        boolean isEvenn = false;
        if(a % 2 == 0) {
            isEvenn = true;
        }else {
            isEvenn = false;
        }
        return isEvenn;
}


public static void palindromeChecker(int a) {
    int rev = 0, rem = 0;
    int num = a;

    while (num > 0) {
        rem = num % 10;
        rev = (rev * 10) + rem;
        num = num / 10;
    }
    if (a == rev) {
        System.out.println(a + " is Palindrome number");
    } else {
        System.out.println(a + " is not Palindrome number");
    }
}

public static int minimumNo(int a, int b){
        return(Math.min(a,b));
}
public static int MaximumNo(int a, int b){
        return (Math.max(a,b));
}
//public static int squareRoot(int a, int b) {
//        return (int)(Math.sqrt(a,b));
//}
public static int power(int a, int b) {
        return (int)(Math.pow(a, b));
}
public static double absolute(double a) {
        return Math.abs(a);
}

public static int sum(int a) {
        int result = 0;
        for(int i = 0; i <= a; i++){
            result += i;
        }
        return result;
}




    public static void main(String[] args) {
        System.out.println(fact(5));
            binaryToDecimal(110011);
            decimalToBinary(51);
        System.out.println( Avg(5));
        System.out.println(isEven(3));
        palindromeChecker(121);

        System.out.println("Minimum No. is =  "+minimumNo(20, 3));
        System.out.println("Maximum No. is =  "+MaximumNo(20, 3));
        System.out.println(power(3,2));
        System.out.println(absolute(-45));

        System.out.println("The Sum is "+sum(10));
    }
}
