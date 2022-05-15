package com.company.wk7_SubStrings.tests;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk7_SubStrings.Knuth_Morris_Pratt;

public class KMP_searchRun_time {

    public static void KMP_searchRun_time(String[][] inputs, int[] dataCount, String[] targets, Stopwatch timer, NanoTime nanoTimer) {
        Knuth_Morris_Pratt KMP = new Knuth_Morris_Pratt();
        StdOut.println("\n-------------Timing performance of Knuth-Morris-Pratt\n\n***************************** Knuth-Morris-Pratt testing Time *****************************************\n");

        for (int i = 0; i < inputs.length; i++) {
            int line = 0;
            int tar = 0;
            for (int j = 0; j < inputs[i].length -1; j++) {
                line++;
                if (inputs[i][j].contains(targets[i])) {
                    StdOut.println("Line " + line + " : ");
                    tar = j;
                    break;
                }
            }
                KMP.Knuth_Morris_Pratt(inputs[i][tar], targets[i]);

                StdOut.println("\nTest " + i + " - " + dataCount[i] + " inputs\n" + "elapsed time = " + timer.elapsedTime());
                StdOut.println("Elapsed time (nano seconds) = " + nanoTimer.elapsedTime() + "\n************************** Next Test *****************************************\n");
            }
        }
    }
