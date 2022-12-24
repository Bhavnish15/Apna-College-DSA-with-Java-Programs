import java.util.Scanner;

public class Arrays {

    static int linearSearch(int[] number, int key) {
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    // Pairs in Array
    public static void pairs(int numberss[]) {
        for(int i = 0; i < numberss.length; i++){
            int current = numberss[i];
            for(int j = i + 1; j < numberss.length; j++){
                System.out.print("("+current+","+numberss[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArrays(int subarr[]){
        int ts = 0;
        for(int i = 0; i < subarr.length; i++){
            int start = i;
            for(int j = i; j < subarr.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(subarr[k]+",");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total Sub Array is: "+ts);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Calling Pairs method
        int[] numberss = {1,3,2,4,8};
        pairs(numberss);

        System.out.println("_________________________________________");

        // Calling subArray
        int[] subarr = {2,4,6,8,10};
        subArrays(subarr);

        System.out.println("_________________________________________");




        // Linear Searching with function
        int[] number = {20,40,5,80,2,57,39,99, 50};
        int key = 2;
        int index = linearSearch(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(index);
        }

        System.out.println("____________________________________________");

        // Linear Searching on Arrays
//        int[] arr = {12,3,5,4,7,5};
//        int a = 4;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == a){
//                System.out.println(i);
//            }
//        }

        System.out.println("_____________________________________________");

        int[] arr_1 = {10,20,30,40,50};
        System.out.println("Contents of the Array: ");
        for(int i = 0; i < arr_1.length; i++){
            System.out.print(arr_1[i]+" ");
        }

        System.out.println("_____________________________________________");

//        int[] arr_2 = new int[5];
//        int x = 0;
//        System.out.print("Enter the contents of the Array: ");
//        for(int i = 0; i < arr_1.length; i++){
//            arr_2[i] = input.nextInt();
//        }
//        System.out.println("Contents of the Array: ");
//        for (int i = 0; i < arr_2.length; i++){
//            System.out.println(arr_2[i]);
//        }
//        System.out.println("Reverse of the Array: ");
//        for(int i = arr_2.length - 1; i >= 0; i--){
//            System.out.println(arr_2[i]);
//        }

        System.out.println("______________________________________________");

//        int[] arr_3 = new int[5];
//        int total = 0;
//        float per;
//        System.out.println("Enter marks of five subjects: ");
//        for(int i = 0; i < 5; i++){
//            arr_3[i] = input.nextInt();
//        }
//        for(int i = 0; i < 5; i++){
//            total +=  arr_3[i];
//        }
//        per = (float) total / 5;
//
//        System.out.println("The Percentage you Got is: "+ per+"%");
//

        System.out.println("______________________________________________");

        //Searching of an Elements in an Array

//        int[] arr_4 = {10,21,63,74,83,90,19,34,72};
//        int found = -1;
//
//        System.out.println("Array Elements are: ");
//        for(int i = 0; i < arr_4.length; i++){
//            System.out.println(arr_4[i]+" ");
//        }
//        System.out.println("Enter the Number you Want to Search: ");
//        int n = input.nextInt();
//        for(int i = 0; i < arr_4.length; i++){
//            if(n == arr_4[i]){
//                found = i;
//                break;
//            }
//        }
//        if(found != -1){
//            System.out.println("The Element is on index: "+found);
//        }else{
//            System.out.println("Sorry Element is Not Present");
//        }


        System.out.println("_________________________________________________");

        // Sorting Of Array Elements

//        int[] arr_5 = new int[5];
//        System.out.println("Unsorted Array Elements: ");
//        for(int i = 0; i < arr_5.length; i++){
//            arr_5[i] = input.nextInt();
//        }
//
//        for(int i = 0; i < arr_5.length; i++){
//            for(int j = i + 1; j < arr_5.length; j++){
//                if(arr_5[i] > arr_5[j]){
//                    int s = arr_5[i];
//                    arr_5[i] = arr_5[j];
//                    arr_5[j] = s;
//                }
//            }
//        }
//        System.out.println("Sorted Array Elements: ");
//        for(int i = 0; i < arr_5.length; i++){
//            System.out.println(arr_5[i]);
//        }

        System.out.println("____________________________________________");

        int[] arr_6 = {1,2,6,3,5};
        int greaterNo = Integer.MIN_VALUE;
        int smallestNo = Integer.MAX_VALUE;
        for(int i = 0; i < arr_6.length; i++){
            if (greaterNo < arr_6[i]) {
                     greaterNo = arr_6[i];
            }
            if(smallestNo > arr_6[i]){
                smallestNo = arr_6[i];
            }
        }
        System.out.println("Greater Number is : "+greaterNo);
        System.out.println("Smallest Number is : "+ smallestNo);

        System.out.println("_________________________________________________");


        // Binary Search
//        int[] numbers = {2,4,6,8,10,12,14};
//        int keys = 12;
//        int start = 0;
//        int end = numbers.length - 1;
//        while(start <= end){
//            int mid = (start + end) / 2;
//            if(numbers[mid] == keys){
//                System.out.print("The Element is at : "+mid);
//                return;
//            }
//            if(numbers[mid] < keys){
//                start = mid + 1;
//            }else{
//                end = mid - 1;
//            }
//        }
//        System.out.println("Key not Found");

        System.out.println("_________________________________________");

        //Reverse an Array

        int[] numArray = {2,4,6,8,10};
        int startt = 0;
        int endd = numArray.length - 1;

        while (startt < endd) {
            int temp = numArray[endd];
            numArray[endd] = numArray[startt];
            numArray[startt] = temp;
            startt++;
            endd--;

        }
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i]+" ");
        }
        System.out.println();

        System.out.println("_________________________________________________");

        // Maximum SubArray Sum
        int[] arrr = {1,-2, 6,-1, 3};
        int total = 0, maxSubArray = Integer.MIN_VALUE, MaxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arrr.length; i++){
            int start = i;
            for(int j = i; j <= arrr.length; j++){
                int end = j;
                total = 0;
                for(int k = start; k < end; k++){
                    System.out.print(arrr[k]+",");
                    total += arrr[k];
                }
                System.out.println("  "+"The sum is: "+ total);
                if(maxSubArray < total ){
                    maxSubArray = total;
                }
                if(MaxSum < maxSubArray){
                    MaxSum = maxSubArray;
                }
                System.out.println();
            }
            System.out.println("The largest sum of above subArray is: "+ maxSubArray);
            System.out.println();
            System.out.println("The Largest in Max SubArray: "+MaxSum);
            maxSubArray =0;

        }

        System.out.println("__________________________________________________________");

        // Maximum SubArray with Optimized Approach

        int[] arr = {1,-2, 6,-1, 3};
        int maxSum = Integer.MIN_VALUE;
        int totall = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        //Calculating prefix Array
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                totall = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < totall){
                    maxSum = totall;
                }
            }
        }
        System.out.println(maxSum);

        System.out.println("__________________________________________");


        // Kadane's Algorithm

        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int currentSum = 0, maxXSum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            currentSum += array[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxXSum = Math.max(currentSum, maxXSum);
        }

        System.out.println(maxXSum);

        System.out.println("___________________________________________________");

        int[] array1 = {-1,-2,-3,-4};
        int cs = 0, minSum = Integer.MAX_VALUE;
        for(int i = 0; i < array1.length; i++){
            cs += array1[i];
            if(cs < 0){
                minSum = Math.min(cs, minSum);
            }
        }
        System.out.println(minSum);

        System.out.println("__________________________________________");


        int[] height = {4,2,0, 6, 3, 2, 5};

// Maximum of left Array
        int[] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
// Maximum of Right Array
        int[] rightMax = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0 ; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0;
        for(int i = 0; i< height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);





        System.out.println("Assignments");

        System.out.println("______________________________________________");

        // 1. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        int[] ints = {8,4,3,2,6};
        boolean isnums = false;

        int firstValue = ints[0];
        for(int i = 1; i < ints.length; i++){
            if(ints[i] == firstValue) {
                isnums = true;
                break;
            }
        }
        firstValue++;
        System.out.println(isnums);


        System.out.println("__________________________________");

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int check = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                if(nums[i] + nums[j] + nums[j+1] == check) {
                    System.out.println("[" + nums[i] + "," + nums[j] + "," + nums[j + 1] + "]");
                }
            }
        }









    }


}
