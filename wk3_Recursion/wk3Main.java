package com.company.wk3_Recursion;

import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;

public class wk3Main {


    public static void testingFibonacciIterative(long n){
        Fibonacci test = new Fibonacci();
        StdOut.println("\n*********************** Testing Iterative Fibonacci Sequence *****************************\n");
        boolean isStop = false;
        Stopwatch timerFibIterative = new Stopwatch();
        while(!isStop){
            test.fibonacciIterative(n);
            StdOut.println("Test " + n + " elapsed time = " + timerFibIterative.elapsedTime() + "\nResult - " + test.fibonacciIterative(n) + "\n");
            if (n == 45){
                isStop = true;
            }
            n++;
        }
    }

    public static void testingFibonacciRecursive(long n){
        Fibonacci test2 = new Fibonacci();
        StdOut.println("\n*********************** Testing Recursvie Fibonacci Sequence *****************************\n");
        boolean isStop = false;
        Stopwatch timerFibRecursive = new Stopwatch();
        while(!isStop){
            test2.fibonacciRecursive(n);
            StdOut.println("Test " + n + " elapsed time = " + timerFibRecursive.elapsedTime() + "\nResult - " + test2.fibonacciRecursive(n) + "\n");
            if (n == 45){
                isStop = true;
            }
            n++;
        }
    }

    public static void testingTOH(int disk){
        TowerOfHanoi test3 = new TowerOfHanoi();
        StdOut.println("\n*********************** Testing Tower Of Hanoi ************************************\n");
        int count=1;
        char source= 'a';
        char dest = 'c';
        char auxillary = 'b';
        Stopwatch timingHanoi = new Stopwatch();
        while(count < 10) {
            System.out.println("\nNumber of moves required to solve with " + disk + " disks is - " + test3.towerOfHanoi(disk, source, dest, auxillary));
            StdOut.println("Test " + count + " elapsed time = " + timingHanoi.elapsedTime() + "\n");
            disk++;
            count++;
        }
    }

    public static void main(String[] args) {
        int n = 1;
        int m = 1;
        int disk = 1;
        testingFibonacciIterative(n);
        testingFibonacciRecursive(m);
        testingTOH(disk);

//        char a = 's';
//        char b = 'a';
//        char c = 'd';
//        TowerOfHanoi test = new TowerOfHanoi();
//        Stopwatch timeTOH = new Stopwatch();
//        for (int i = 0; i < 30; i++){
//            test.towerOfHanoi(i, a, b, c);
//            StdOut.println("Test " + i + " elapsed time = " + timeTOH.elapsedTime()  + "\n");
//        }
    }
}
