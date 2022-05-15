package com.company.wk6_advancedSortingII;
import com.company.wk1.StdOut;
import static com.company.wk4_elementarySortingI.Sorts_starter_code.*;

public class QuickSort {

    private static void partition(int[] a, int low, int high){
        int l = low; // low is index 0th
        int h = high; // high is the last index
        int pivot = a[high];
        while(l<=h){

            while(a[l] < pivot) // as long as the left index is smaller than the median, increment rightwards
                l++;
            while(a[h]>pivot) // as long as the rightmost element is greater than the median, decrement leftwards
                h--;
            if (l<=h){
                helperSwap(a, l, h);
                l++; // moves both sides to the next index
                h--;
            }
        }
//         calls partition method recursively
        if (low<h)
            partition(a, low, h);
        if (l<high)
            partition(a, l, high);
    }

    public static void sort(int[] a){
        if (a == null || a.length == 0)
            return;
//        helperShuffle(a); // to be added to the enhanced Quicksort class to improve overall performance
        partition(a, 0, a.length-1);
    }


    public static void main(String[] args) {
        int[] data = {4,3,2,6,8,4,5,3,1,5,7,77,333,22,4};
        StdOut.println("Unsorted Sorted");
        helperPrintArr(data);
        StdOut.println("\nSorted");
        sort(data);
        helperPrintArr(data);
    }

}
