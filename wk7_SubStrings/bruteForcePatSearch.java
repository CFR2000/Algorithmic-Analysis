package com.company.wk7_SubStrings;

import com.company.wk1.StdOut;

public class bruteForcePatSearch {

    public static int bruteForcePatSearch(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int k;
            for (k = 0; k < m; k++) {
                if (txt.charAt(i + k) != pat.charAt(k)) break;
            }
            if (k == m) return i; // i is the index at where the pattern begins.
        }
        return n;
    }

    public static void printPattern(int position, String txt, String pat){
        int m = pat.length();
        for (int i = 0; i < m; i++){
            System.out.print(txt.charAt(position));
            position++;
        }
    }

    public static void main(String[] args) {
        String txt = "asdsdgsaojnvojsfvnsnvmisslesgdgsdjfi";
        String pat= "sd";
        int results = bruteForcePatSearch(txt, pat);
        StdOut.println(results);
        printPattern(results, txt, pat);
    }
}