public class PatternsPractice {

    static void pattern_1() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
    static void pattern_2() {
        char ch = 'A';
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    static void pattern_3() {
        for(int i = 0; i <= 4; i++){
            for(int s = i; s <= 3; s++){
                System.out.print(" ");
                for(int j = i; j <= i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void pattern_4() {
        char ch = 'A';
        for(int i = 65; i <= 69; i++){
            for(int j = 65; j <= 69; j++){
                System.out.print(" "+ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void pattern_5() {
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(" "+"*"+" ");
        }
        System.out.println();
        }
    }
    static void pattern_6() {
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= 5; j++){
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }
    static void pattern_7() {
        int k = 1;
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" " + k + " ");
                k++;
            }
            System.out.println();
        }
    }
    static void pattern_8() {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(((i + j) % 2)+" ");
            }
            System.out.println();
        }
    }
    static void pattern_9() {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print(((i*j) % 2)+ " ");
            }
            System.out.println();
        }
    }
    static void pattern_10() {
        for(int i = 1; i < 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }

    static void pattern_11(){
        for(int i = 5; i >= 1; i--){
            for(int j = i; j <= 5; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    static void pattern_12() {
        int x1 = 0;
        int x2 = 1;
        int z = x1 + x2;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+z+" ");
                z = x1 + x2;
                x1 = x2;
                x2 = z;
            }
            System.out.println();
        }
    }

    static void pattern_13() {
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
    }

    static void pattern_14(int totRows, int totColumns) {
        for(int i = 1; i <= totRows; i++){
            for(int j = 1; j <= totColumns; j++){
                if(i == 1 || i == totRows || j == 1 || j == totColumns) {
                    System.out.print(" "+"*"+" ");
                }else {
                    System.out.print(" "+" "+" ");
                }
            }
            System.out.println();
        }
    }


    static void pattern_15() {
        for(int i = 1; i <= 4; i++){
            for(int j = 3; j >= i; j--){
                System.out.print(" ");
            }
            for(int m = 1; m <= i; m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern_16() {
        for(int i = 1; i <= 4; i++){
            for(int m = 1; m <= 4 - i; m++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_17() {
        for(int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }

    }

    static void pattern_18() {
        int count = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+count+" ");
                count++;
            }
            System.out.println();
        }
    }

    static void pattern_19() {
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print(((i+j) % 2)+" ");
            }
            System.out.println();
        }
    }

    static void pattern_20() {
        int n = 5;
        int numStar = 1;
        int numCol = n * 2 - 1;

        for(int i = 1; i <= n*2-1; i++){
            for(int j = 1; j <= n*2-1; j++){
                if(j <= numStar || j >= numCol){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i < n){
                numStar++;
                numCol--;
            }else {
                numCol++;
                numStar--;
            }
        }
    }

    static void pattern_21() {
        for(int i=1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(4 -i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(4 -i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_22() {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_23() {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern_24() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        //pattern_1();
        //pattern_2();
        //pattern_3();
        //pattern_4();
        //pattern_5();
        //pattern_6();
        //pattern_7();
        //pattern_8();
        //pattern_9();
        //pattern_10();
        //pattern_11();
        //pattern_12();
        //pattern_13();
        pattern_14(4, 5);
        System.out.println("_______________________________");
        pattern_15();
        System.out.println("_______________________________");
        pattern_16();
        System.out.println("________________________________");
        pattern_17();
        System.out.println("________________________________");
        pattern_18();
        System.out.println("________________________________");
        pattern_19();
        System.out.println("________________________________");
        pattern_20();
        System.out.println("________________________________");
        pattern_21();
        System.out.println("________________________________");
        pattern_22();
        System.out.println("________________________________");
        pattern_23();
        System.out.println("________________________________");
        pattern_24();


    }
}