package com.company.wk5_elementarySortingII;

import com.company.wk1.StdOut;
import com.company.wk4_elementarySortingI.Sorts_starter_code;

public class MergeSortEnhanced {


    public static class mergeSortEnhanced {

        public static boolean isSorted(int[] arr) {
            boolean isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[1 + 1]) {
                    isSorted = false;
                    return isSorted;
                }
            }
            return isSorted;
        }

        public static void merge(int[] a, int low, int mid, int hi) {
            //copy the array a to an aux array


            int l = mid - low + 1;
            int r = hi - mid;

            int[] leftArray = new int[l];
            int[] rightArray = new int[r];

            for (int i = 0; i < l; ++i) {
                leftArray[i] = a[low + i];
            }

            for (int j = 0; j < r; ++j) {
                rightArray[j] = a[mid + 1 + j];
            }

            int i = 0, j = 0;
            int k = low;
            while (i < l && j < r) {
                if (leftArray[i] <= rightArray[j]) {
                    a[k] = leftArray[i];
                    i++;
                } else {
                    a[k] = rightArray[j];
                    j++;
                }
                k++;

            }

            while (i < l) {
                a[k] = leftArray[i];
                i++;
                k++;
            }

            while (j < r) {
                a[k] = rightArray[j];
                j++;
                k++;
            }
        }


        // recursive
        public static int[] sortEnhanced(int[] array, int left, int right) {

            // checks if the array is already sorted. If so it returns the array
            boolean isSorted = isSorted(array);
            if (isSorted) {
                return array;
            }
            // if the size of the array is 100 or less use insertion sort as it is better dealing with smaller inputs than merge sort
            if (array.length <= 100) {
                Sorts_starter_code smallCase = new Sorts_starter_code();
                smallCase.insertionSort(array);
                StdOut.println("Input size is < 100, so calling insertion sort on array!");
                return array;
            }
            // as long as the left element is smaller than a right element the lists continues sorting;
            if (left < right) {
//            mid = left + (right - 1) / 2; // finds mid point int mid = (left+right) / 2;
                int mid = (left + right) / 2;
                // sorts first and second halves
                sortEnhanced(array, left, mid); //sorting left
                sortEnhanced(array, mid + 1, right); // sorting right
                // merge the sorted halves
                if (array[mid] > array[mid + 1]) {
//                    StdOut.println("mid is greater than mid+1 s0 merge() is needed.");
                    merge(array, left, mid, right);
                }
            }
            return array;

        }


        public static void main(String[] args) {
            int arr[] = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
            com.company.wk5_elementarySortingII.MergeSort ob = new com.company.wk5_elementarySortingII.MergeSort();
            ob.sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "");
            }
        }
    }
}

