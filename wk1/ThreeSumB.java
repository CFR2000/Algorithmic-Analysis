package com.company.wk1;
/******************************************************************************
 *  Compilation:  javac ThreeSumB.java
 *  Execution:    java ThreeSumB input.txt
 *
 *  Reads n integers
 *  and counts the number of triples that sum to exactly 0.
 *
 *  Limitations
 *  -----------
 *     - we ignore integer overflow
 *     - doesn't handle case when input has duplicates
 *     
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *
 ******************************************************************************/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.lang.*;


public class ThreeSumB {

    // Do not instantiate.
    private ThreeSumB() { }

    // returns true if the sorted array a[] contains any duplicated integers
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true;
        return false;
    }

  
    /**
     * Returns the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}.
     *
     * @param a the array of integers
     * @return the number of triples (i, j, k) with {@code i < j < k}
     * such that {@code a[i] + a[j] + a[k] == 0}
     */
    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if (k > j) count++;
            }
        }
        return count;
    } 

/**
     * Reads in a sequence of integers from a file, specified as a command-line argument;
     * counts the number of triples sum to exactly zero; prints out the time to perform
     * the computation.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args)  {
        File Bf1 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\8ints.txt");
        In in1 = new In(Bf1);
        int[] a = in1.readAllInts();

        File Bf2 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\1Kints.txt");
        In in2 = new In(Bf2);
        int[] b = in2.readAllInts();

        File Bf3 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\2Kints.txt");
        In in3 = new In(Bf3);
        int[] c = in3.readAllInts();

        File Bf4 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\4Kints.txt");
        In in4 = new In(Bf4);
        int[] d = in4.readAllInts();

        File Bf5 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\8Kints.txt");
        In in5 = new In(Bf5);
        int[] e = in5.readAllInts();

        File Bf6 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\16Kints.txt");
        In in6 = new In(Bf6);
        int[] f = in6.readAllInts();

        //Helper file to measure time count function takes to run
        int[][] arr =  new int[][]{a, b, c, d, e, f};
        //Helper file to measure time count function takes to run
        Stopwatch timer = new Stopwatch();

        for (int[] ints : arr) {
            int count = count(ints);
            StdOut.println("elapsed time = " + timer.elapsedTime());
            StdOut.println(count);

        }
            for (int i = 0; i != arr.length; i++) {
                try {
                    File test2 = new File("Findings2(B).txt");
                    if (!test2.exists()) {
                        test2.createNewFile();
                    }

                    FileWriter fileWriter = new FileWriter(test2.getName(), true);
                    BufferedWriter bw = new BufferedWriter(fileWriter);
                    bw.write(count(arr[i]) + " \n");
                    bw.close();
                    System.out.println("Done");

                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

        }
    }
