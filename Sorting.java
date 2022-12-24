public class Sorting {
    public static void main(String[] args) {

        // Bubble Sort
        int[] arr = {5,4,1,3,2};
        int n = arr.length, swap;

        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println("_______________________");

        // Selection Sort
        int[] arr_1 = {5,4,1,3,2};

        for(int i = 0; i < arr_1.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr_1.length-1; j++){
                if(arr_1[min] > arr_1[j]){
                    min = j;
                }
            }
            int temp = arr_1[min];
            arr_1[min] = arr_1[i];
            arr_1[i] = temp;
        }
                for(int i =0; i < arr_1.length; i++){
                    System.out.println(arr[i]);
                }
        System.out.println("_______________________________________");


        System.out.println("_______________________________");
        // Insertion Sort
        int[] arrr ={5,4,1,3,2};
        for(int i = 0; i < arrr.length; i++){
            int curr = arrr[i];
            int prev = i- 1;

            while(prev >= 0 &&  arrr[prev] > curr){
                arrr[prev + 1] = arrr[prev];
                prev--;
            }
            arrr[prev + 1] = curr;
        }
        for(int i = 0; i < arrr.length; i++){
            System.out.println(arrr[i]);
        }

        System.out.println("________________________________________-");

        int largest = Integer.MIN_VALUE;
        int[] num = {1,4,1,3,2,4,3,7};

        for(int i = 0; i < num.length; i++){
            largest = Math.max(largest, num[i]);
        }
        int[] count = new int[largest+1];
        for(int i = 0; i < num.length; i++){
            count[num[i]]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                num[j] = i;
                j++;
                count[i]--;
            }
        }
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }


        System.out.println("____________________________-");


        int[] a = {3,6,2,1,8,7,4,5,3,1};

        for(int i = 1; i < a.length; i++) {
            int k = i - 1;
            int q = a[i];
            while (k >= 0 && a[k] > q) {
                a[k + 1] = a[k];
                k--;
            }
            a[k + 1] = q;
        }
        for (int k : a) {
            System.out.println(k);
        }






    }
}
