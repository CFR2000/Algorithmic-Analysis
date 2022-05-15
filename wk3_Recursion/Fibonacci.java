package com.company.wk3_Recursion;

public class Fibonacci {

        public static long fibonacciIterative(long n) {
            if (n <= 1)
                return 1;

            int fib = 1;
            int prevFib = 1;

            for (int i = 2; i < n; i++) {
                int temp = fib;
                fib = fib + prevFib;
                prevFib = temp;
            }
            return fib;
        }

        // returns the value at the nth level of the sequence
        public static long fibonacciRecursive(long n) {
            if (n == 0 || n == 1) return n;
            else {
                return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            }
        }
    }
