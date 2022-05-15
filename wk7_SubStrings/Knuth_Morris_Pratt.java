package com.company.wk7_SubStrings;

import com.company.wk1.In;
import com.company.wk1.StdOut;

public class Knuth_Morris_Pratt {
    String input10 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubString\\data\\10-inputs";

    public void Knuth_Morris_Pratt(String txt, String pattern) {
        int M = pattern.length();
        int N = txt.length();

        //lps[] will hold the longest suffix values for pattern
        int[] lps = new int[M];

        int j = 0; // index for the pattern
        computeLPSArray(pattern, M, lps);

        int i = 0; // index for txt[]

        while (i < N) {
            if (pattern.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern " + "at index " + (i - j));
                j = lps[j - 1];
            }


            // mismatch after j matches

            else if (i < N && pattern.charAt(j) != txt.charAt(i)) {
                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    void computeLPSArray(String pattern, int m, int[] lps) {
        //length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0;

        // the while loop computes lps[i] for i = 1 to m - 1
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = len;
                    i++;
                }
            }

        }
    }


    public static void main(String[] args) {
        Knuth_Morris_Pratt test = new Knuth_Morris_Pratt();
        String input10 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\10-inputs";
        In in0 = new In(input10);
        String[] data10 = in0.readAllStrings();

        for (int i = 0; i<10; i++) {
            int count = 1;
            if (data10[i].contains("ip"))
                StdOut.println("Line " + count + " : ");
            test.Knuth_Morris_Pratt(data10[i], "ip");
            count++;
        }



    }
}
