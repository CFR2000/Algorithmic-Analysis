package com.company.wk2_complexity;

import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;


public class wk2Main {

    public static void main(String[] args) {
        long[] aa = new long[]{12, 69, 490, 2000, 50000, 342423};
        long[] bb = new long[]{5, 86, 230, 5687, 79583, 986975};
        System.out.println("Hello - I have choosen Option B for this Analysis");

        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < bb.length; i++) {

            RussianPeasant.russianPeasant(aa[i], bb[i]);
            StdOut.println("Test " + i + " elapsed time = " + timer.elapsedTime());
            StdOut.println("Result of " + aa[i] + " * " + bb[i] + " = " + RussianPeasant.russianPeasant(aa[i], bb[i]) + "\n");
        }

        StdOut.println("This is testing for BigInts");
        Stopwatch timerForBigInt = new Stopwatch();
        for (int i = 0; i < bb.length; i++) {

            aa[i] *= 64;
            bb[i] *= 64;
            RussianPeasant.russianPeasant(aa[i], bb[i]);
            StdOut.println("Test " + i + " elapsed time = " + timerForBigInt.elapsedTime());
            StdOut.println("Result of " + aa[i] + " * " + bb[i] + " = " + RussianPeasant.russianPeasant(aa[i], bb[i]) + "\n");
        }


    }
}

