import java.util.Arrays;

public class Two_D_Arrays {
    public static void main(String[] args) {

 //  ************** Input from User in 2-Arrays *****************

        int[][] arr = new int[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Values");
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Given Matrix is: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


   //     ***************** 2-Array Declaration and Initialization *****************

        int[][] arr = {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};  //Declaration and initialization
        System.out.println("Array is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


 //   ***************** String 2-D Array *******************

        String[][] arr = {{"C","C++"},{"Java","JavaScript"},{"Python","Flutter"}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//**************** Sum of the Array *******************

        System.out.println("Array is: ");
        int[][] arr = {{5,4,3,2,3}, {8,7,6,5,4}, {4,3,6,4,3}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);


//************ Greatest Element in an Array *************

        int[][] arr = {{5,4,3,2,3}, {8,7,6,5,4}, {4,3,6,4,3}};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > max ) {
                    max = arr[i][j];
                }

            }
        }
        System.out.println("Biggest element in Array is : "+max);


//  ************* Sum Of Columns and Rows ******************

        int[][] arr = {{5, 4, 3, 2, 3}, {8, 7, 6, 5, 4}, {4, 3, 6, 4, 3}};
        int Rowsum = 0; int colSum =0;

        // Displaying Matrix
        System.out.println("Array is: ");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        //Sum of Rows ***************

        System.out.println("Sum of Rows: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                Rowsum += arr[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " Row is " + Rowsum);
            Rowsum = 0;

        }
        //Sum of Columns ************

        System.out.println("Sum of Columns: ");
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                colSum += arr[j][i];

            }
            System.out.println("Sum of " + (i + 1) + " Column is " + colSum);
                colSum = 0;
        }


//**************** Sum of Diagonal in a Matrix ********************

        int[][] arr = {{5, 4, 3}, {8, 7, 6}, {4, 3, 6,}};
        // Printing 2-D Array
        System.out.println("Array is: ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        // Logic
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i + j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);


//******************** Sum of Edges ***********************

        System.out.println("Array is: ");
        int[][] arr = {{5, 4, 3}, {8, 7, 6}, {4, 3, 6,}};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        // Logic
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == 0 || i == arr.length - 1 || j == 0 || j == arr.length - 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);


//*************************** Search an element in 2-D Arrays *******************************

        System.out.println("Array is: ");
        int[][] arr = {{5, 4, 3}, {8, 7, 6}, {4, 3, 6,}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        // Logic
        int key = 7; int result = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println(key + " found at [" +i+ "]"+"[" +j+ "]");
                }
            }
        }


//************************* How many times an item in an array ***************************

        System.out.println("Array is: ");
        int[][] arr = {{5, 4, 3}, {8, 7, 6}, {4, 3, 6,}};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        // Logic
        int key = 6;  int result = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(key == arr[i][j]){

                    result = j;
                }
            }
        }
        System.out.println(key + " found "+result+" times");


//******************** Spiral Matrix ***********************

        int[][] Matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                System.out.print(Matrix[i][j]+"  ");
            }
            System.out.println("  ");
        }



        int startR = 0; int endR = Matrix.length - 1;
        int startC = 0; int endC = Matrix[0].length - 1;

        while(startR <= endR && startC <= endC){
            // Top
            for (int j = startC; j <= endC; j++){
                System.out.print(Matrix[startR][j]+" ");
            }
            // Right
            for (int i = startR + 1; i <= endR; i++){
                System.out.print(Matrix[i][endC]+" ");
            }
            // Bottom
            for (int j = endC - 1; j >= startC; j--){
                if(startR == endR){break;}
                System.out.print(Matrix[endR][j]+ " ");
            }
            // Left
            for (int i = endR - 1; i >= startR + 1; i--){
                if(startC == endC){break;}
                System.out.print(Matrix[i][startC]+" ");
            }
            startC++;
            startR++;
            endC--;
            endR--;
        }
        System.out.println();


        //*************** Matrix of Both Diagonals Sum in linear time **********************

        int[][] Matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,2,1,4},
                {1,2,2,1}
        };
        for(int i = 0; i < Matrix.length; i++){
            for(int j = 0; j < Matrix[0].length; j++){
                System.out.print(Matrix[i][j]+"  ");
            }
            System.out.println("  ");
        }
        int sum = 0;
        for(int i = 0; i < Matrix.length; i++){
            sum += Matrix[i][i];
            if(i != Matrix.length - 1 - i)
                sum += Matrix[i][Matrix.length - i - 1];
        }
        System.out.println(sum);



// *************** Search in Sorted matrix from position top right corner ********************

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

    int key = 40;
    int row = 0; //row
    int col = arr[0].length - 1;  //column
    while(row < arr.length && col >= 0){
        if(arr[row][col] ==  key){
            System.out.println("Your key is on ("+ row + ","+ col + ")");
            break;
        }
        else if(key < arr[row][col]){
            col--;
        }else{
            row++;
        }

    }
        System.out.println("Key not Found!!");



// **************** Search in Sorted Matrix from position bottom left corner ***********
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
                int key = 20;
                int row = 2, col = 0;

                while(row < arr.length && col < arr[0].length){
                    if(key == arr[row][col]){
                        System.out.println("Your Element is at ("+row+","+col+")");
                        break;
                    }else if(key < arr[row][col]){
                        row--;
                    }else{
                        col++;
                    }
                }
        System.out.println("Your key not found!!");



        int[][] arr = {{4,7,8},
                        {8,8,7}};


        int count = 0;
        int key = 8;

       for(int row = 0; row < arr.length; row++){
           for(int col = 0; col < arr[0].length; col++){
               if(key == arr[row][col]){
                   count++;
               }
           }
       }
        System.out.println("Number of "+key +" is Array in"+count);


//*********** Sum of 3'rd Row in 2-D Array *********************

        int[][] arr = {{1,4,9}, {11,4,3}, {2,2,3}};
        int sum = 0;
        int row = 1;
        int col = 0;
        while(row < arr.length && col < arr[0].length){
            sum += arr[row][col];
            col++;

        }
        System.out.println(sum);



//************ Transpose of a Matrix in another 2DArray called (transpose)***************

        int[][] arr = {{3,4,2}, {1,6,3}, {5,7,2}};
        int [][] transpose = new int[arr.length][arr[0].length];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                transpose[row][col] = arr[col][row];
            }
        }
        System.out.println((Arrays.deepToString(transpose)));


    }
}
