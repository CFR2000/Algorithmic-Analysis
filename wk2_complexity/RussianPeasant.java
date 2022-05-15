package com.company.wk2_complexity;


public class RussianPeasant {

    public RussianPeasant() {

    }

    public static long russianPeasant (long a, long b){
        long res = 0;
        while(b > 0){
            if(b % 2 != 0){ // if b is odd
                res += a;
            }
            a *= 2;
            b /= 2;
        }
        return res;
    }
}
