package com.company.wk6_advancedSortingII;

import static com.company.wk4_elementarySortingI.Sorts_starter_code.*;
//Q2.)
public class QuickSortEnhanced {

    private static void partition(int[] a, int low, int high){
        int l = low; // low is index 0th
        int h = high; // high is the last index
        int pivot = a[low+(high-low)/2]; // 3) partition where value is near the middle - median
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
        if (low < h)
            partition(a, low, h);
        if (l<high)
            partition(a, l, high);
    }

    public static void sort(int[] a){
        if (a == null || a.length == 0)
            return;
        else if(a.length <= 10) // 1) adding a cutoff for small sub-arrays, improves overall performance.
            insertionSort(a);

        helperShuffle(a); // 2) randomly shuffling the input first to improve performance and protect against the worst case performance
        partition(a, 0, a.length-1);
    }

}
