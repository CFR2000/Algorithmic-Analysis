package com.company.wk4_elementarySortingI;

public class Sorts_starter_code {


    // prints array
    public static void helperPrintArr(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // swaps the left with right and right with left
    public static void helperSwap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


    public static void selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length - 1; i++){
            min = i;
                for (int j =i+1; j < arr.length; j++){
                    // when element at j is less then the element at min set the new min to j;
                    if (arr[j] < arr[min]){
                        min = j;
                    }
                }
                //out of inner for loop - swap values when min dosen't equal i
                if(min != i){
                    helperSwap(arr, i,min);
                }
        }
    }

    public static void insertionSort(int[] arr){
        int key, value;
        for (int i = 1; i < arr.length; i++) { // int i = 1 bc there if i = 0 there is nothing to compare it with on the left
            key = i;
            value = arr[i];
            //checking if the element at arr[i] is less than the element before it.
            while((key>0) && (value < arr[key-1])){
                // if so move that element one spot to the right
                arr[key] = arr[key-1]; // moves element which is larger to the right
                key--;
            }
            arr[key] = value;

        }
    }

    public static boolean helperIsSorted(int[] arr){
        for (int i=1;i<arr.length;i++)
            if (arr[i]<arr[i-1])
                return false;
            return true;

    }

    public static void helperShuffle(int[] arr){
        int i = arr.length-1;
        while (i>0)
            helperSwap(arr,i--,(int)(Math.random()*i));
    }

    public static void bogoSort(int[] arr){

        int count = 1; // keeps track of shufflez.
        while(!helperIsSorted(arr)){
            helperShuffle(arr);
            count++;
        }
        System.out.println(count + " shuffles were made to make this sort!");
    }

    public static void unstableInsertionSort(int[] arr){
        int key, value;
        for (int i = 1; i < arr.length; i++) { // int i = 1 bc there if i = 0 there is nothing to compare it with on the left
            key = i;
            value = arr[i];
            //checking if the element at arr[i] is less than the element before it.
            while((key>0) && (value <= arr[key-1])){
                // if so move that element one spot to the right
                arr[key] = arr[key-1]; // moves element which is larger to the right
                key--;
            }
            arr[key] = value;

        }
    }

    public static void main(String[] args) {
        //selection sort
        int[] arr = {5,4,3,2,1}; // worst case
        helperPrintArr(arr);

        selectionSort(arr);
        helperPrintArr(arr);

        //insertion sort
        int[] arr2 = {10,9,8,7,6}; // worst case
        helperPrintArr(arr);

        insertionSort(arr);
        helperPrintArr(arr);
    }
}
