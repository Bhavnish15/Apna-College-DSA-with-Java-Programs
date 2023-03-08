import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

        //***************** Charecter Array *****************

//        char[] arr = {'a', 'b', 'c', 'd'};
//        System.out.println(Arrays.toString(arr));

        //**************** Declaring Stings *********************

//        String str = "abcd";                   // declaring and initializing
//        String str2 = new String ("xyz");     // declaring and initializing
//        System.out.println(str);
//        System.out.println(str2);


        //********************* Input/Output ********************

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();    // use next() => for input a word
//        System.out.println(name);          // Output given Line


        //********************** length() ************************

//        String name = "Bhavnish Bhardwaj";
//        System.out.println(name.length());


        //******************** Concatination *********************

//        String firstName = "Bhavnish";
//        String lastName = "Bhardwaj";
//        System.out.println(firstName +" "+ lastName);


        //******************** CharAt() **************************

//        String firstName = "Bhavnish";
//        for(int i = 0; i < firstName.length(); i++){
//            System.out.println(firstName.charAt(i));
//        }
//        System.out.println(firstName.charAt(2));


        //******************* Palindrome Strings *******************
        // ex. =>  racecar, noon, madam

//        String str = "racecar"; String result = "";
//        for(int i = 0; i < str.length()/2; i++){
//            if(str.charAt(i) == str.charAt(str.length() - 1 - i)){
//                result = "Palindrome String";
//            }else{
//                result = "Not a Palindrome String";
//            }
//        }
//        System.out.println(result);



//************ Finding Shortest Path containing 4 directions (East, West, North, South) ************

//        int x = 0, y = 0;
//        String path = "ESSSWWWN";
//
//        for(int i = 0; i < path.length(); i++){
//            char c = path.charAt(i);
//            if(c == 'W'){
//                x--;
//            }else if(c == 'E'){
//                x++;
//            }else if(c == 'N'){
//                y++;
//            }else if(c == 'S'){
//                y--;
//            }
//        }
//        double x2 = x * x;
//        double y2 = y * y;
//        int result = (int)Math.sqrt(x2 + y2);
//        System.out.println(result);



//************************* String Comparison ********************************

//        String s1 = "Bhavnish";
//        String s2 = "Bhavnish";
//        String s3 = new String("Bhavnish");
//
//        if(s1 == s3){
//            System.out.println("Strings are Equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }
//            //*** equals ***
//        if(s3.equals(s1)){
//               System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are not equal");
//        }



// ************ toLowerCase() / toUpperCase() **************

//        String s1 = "BHAVNSIH";
//        System.out.println("After Converting in to Lower Case: "+s1.toLowerCase());

//****************** Substring() ***************

//        String str = "Bhavnish";
//        System.out.println(str.substring(2,6));

//*************** CompareTo() *****************

//        String[] toys = {"Toilet","Horse", "Cow"};
//        String largest = toys[0];
//        for(int i = 0; i < toys.length; i++){
//            if(largest.compareTo(toys[i]) < 0){
//                largest += toys[i];
//            }
//        }
//        System.out.println(largest);


//*************** StringBuilder *****************

//        StringBuilder sb = new StringBuilder("Hello");
//        for(char ch = 'A'; ch < 'Z'; ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);



 //*********** Convert First Letter of a String to UpperCase ***********

        // String str = "this is bhavnish bhardwaj";
        // StringBuilder sb = new StringBuilder("");
        // char ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);
        //
        // for(int i = 1; i < str.length(); i++){
        //     if(str.charAt(i) == ' ' && i < str.length() - 1){
        //         sb.append(str.charAt(i));
        //         i++;
        //         sb.append(Character.toUpperCase(str.charAt(i)));
        //     }else{
        //         sb.append(str.charAt(i));
        //     }
        // }
        //        System.out.println(sb.toString());



//**************** String Compression *****************

//        StringBuilder sb = new StringBuilder("");
//        Integer count = 1;
//        String str = "abcd";
//        for(int i = 0; i < str.length(); i++){
//            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
//                count++;
//                i++;
//            }
//            sb.append(str.charAt(i));
//
//                if(count > 1) {
//                    sb.append(count.toString());
//                }
//        }
//        System.out.println(sb.toString());



//******* Count how many times lowercase vowels occurred in a String entered by the user. ********

//        String str = "How is your day";
//        char ch = ' ';
//        int count = 0;
//        int total = 0;
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//                count++;
//            }
//        }
//        System.out.println("Count of Vowels is "+ count);


//***************************** String is a Anagram *******************************

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first String to check Weather it is anagram or not: ");
//        String st1 = input.nextLine();
//        System.out.println("Enter Second String to check Weather it is anagram or not: ");
//        String st2 = input.nextLine();
//
//        String result = "";
//        for(int i = 0; i < st1.length(); i++){
//            for(int j = 1; j < st2.length(); j++) {
//                if (st1.charAt(i) == st2.charAt(j)) {
//                    result = "This String is a Anagram.";
//                } else {
//                    result = "Not a Anagram";
//                }
//            }
//        }
//        System.out.println(result);



// *********** String intern() Method ************

//        String st = new String("Bhavnish");
//        String sr = "Bhavnish";
//        String srr = st.intern();
//        System.out.println(sr == srr);
//        System.out.println(srr);



// ********** Get the character at the given index within the String. *******

//        String str = "Bhavnish";
//        System.out.println(str.charAt(0));

// ******* Taking Ascii values of a charecter with the help of   codePointAt() ******

//        String str1 = "Bhavnish";
//        System.out.println(str1.codePointBefore(1));


// ****** Write a Java program to compare two strings lexicographically.
// Two strings are lexicographically equal if they are the same length and
// contain the same characters in the same positions. ********

//        String lexi_1 = "This is Exercise 1";
//        String lexi_2 = "This is Exercise 2";
//        System.out.println(lexi_1.compareTo(lexi_2));


// ******* Write a Java program to compare two strings lexicographically, ignoring case differences *******

//        String str2 = "This is exercise 1";
//        String str3  = "This is Exercise 1";
//        System.out.println(str2.compareToIgnoreCase(str3));

// ****** Write a Java program to concatenate a given string to the end of another string. ********

//        String str = "PHP Exercise and ";
//        String str2 = "Python Exercise";
//        System.out.println(str.concat(str2));


// ******** Write a Java program to test if a given string contains the specified sequence of char values ******

//        String str = "PHP Exercise and Pyhton Exercise";
//        System.out.println(str.contains("and"));


// ******* Write a Java program to compare a given string to the specified character sequence. *******

//        String str1 = "example.com";
//        String str2 = "example.com";
//        String str3 = "example.com";
//        String str4 = "Example.com";
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str3.equals(str4));


// ****** Write a Java program to compare a given string to the specified string buffer *******

//        String str = "Bhavnish";
//        StringBuffer str1 = new StringBuffer("Bhavnish");
//        System.out.println(str.equals(str1));

// ****** Write a Java program to create a new String object with the contents of a character array.******

        char[] arr = {'1', '2', '3','4'};
        String str = String.copyValueOf(arr, 0,4);
        System.out.println(str);







    }
}
