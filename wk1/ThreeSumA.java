package com.company.wk1;
/******************************************************************************
 *  Compilation:  javac ThreeSumA.java
 *  Execution:    java ThreeSum input.txt
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 ******************************************************************************/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.lang.*;


public class ThreeSumA {

    // Do not instantiate.
    private ThreeSumA() {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
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
    public static void main(String[] args) throws IOException {
        File Af1 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\8ints.txt");
        In in1 = new In(Af1);
        int[] a = in1.readAllInts();

        File Af2 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\1Kints.txt");
        In in2 = new In(Af2);
        int[] b = in2.readAllInts();

        File Af3 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\2Kints.txt");
        In in3 = new In(Af3);
        int[] c = in3.readAllInts();

        File Af4 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\4Kints.txt");
        In in4 = new In(Af4);
        int[] d = in4.readAllInts();

        File Af5 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\8Kints.txt");
        In in5 = new In(Af5);
        int[] e = in5.readAllInts();

        File Af6 = new File("C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk1\\data\\16Kints.txt");
        In in6 = new In(Af6);
        int[] f = in6.readAllInts();

        int[][] arr = new int[][]{a, b, c, d, e, f};
        //Helper file to measure time count function takes to run
        Stopwatch timer = new Stopwatch();

        for (int[] ints : arr) {
            int count = count(ints);
            StdOut.println("elapsed time = " + timer.elapsedTime());
            StdOut.println(count);
        }


        for (int i = 0; i != arr.length; i++) {
            try {
                File test1 = new File("Findings.txt");
                if (!test1.exists()) {
                    test1.createNewFile();
                }

                FileWriter fileWriter = new FileWriter(test1.getName(), true);
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

