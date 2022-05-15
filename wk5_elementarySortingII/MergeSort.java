package com.company.wk5_elementarySortingII;

public class MergeSort {

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


    //    public static int[] mergeSortRecursive(){
//        return;
//    }
    // recursive
    public static int[] sort(int[] array, int left, int right) {
        // as long as the left element is smaller than a right element the lists continues sorting;
        if (left < right) {
//            mid = left + (right - 1) / 2; // finds mid point int mid = (left+right) / 2;
            int mid = (left+right)/2;
            // sorts first and second halves
            sort(array, left, mid); //sorting left
            sort(array, mid + 1, right); // sorting right
            // merge the sorted halves
            merge(array, left, mid, right);
        }
        return array;

    }


    public static void main(String[] args) {
        int arr[] = {90,23,101,45,65,23,67,89,34,23};
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
}

//.3 The Running Time of Merge-Sort
//        We begin by analyzing the running time of the merge algorithm. Let n1 and n2
//        be the number of elements of S1 and S2, respectively. It is clear that the operations
//        performed inside each pass of the while loop take O(1) time. The key observation is
//        that during each iteration of the loop, one element is copied from either S1 or S2 into
//        S (and that element is considered no further). Therefore, the number of iterations
//        of the loop is n1 +n2. Thus, the running time of algorithm merge is O(n1 +n2).
//        Having analyzed the running time of the merge algorithm used to combine
//        subproblems, let us analyze the running time of the entire merge-sort algorithm,
//        assuming it is given an input sequence of n elements. For simplicity, we restrict our
//        attention to the case where n is a power of 2. We leave it to an exercise (R-12.3) to
//        show that the result of our analysis also holds when n is not a power of 2.
//        When evaluating the merge-sort recursion, we rely on the analysis technique
//        introduced in Section 5.2. We account for the amount of time spent within each
//        recursive call, but excluding any time spent waiting for successive recursive calls
//        to terminate. In the case of our mergeSort method, we account for the time to
//        divide the sequence into two subsequences, and the call to merge to combine the
//        two sorted sequences, but we exclude the two recursive calls to mergeSort.