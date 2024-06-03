package org.example;

import java.util.Arrays;

public  class Solution70 {
    public  static void main (String[] args){
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        //Применение чисел Фибоначи в реалльном мире...
        //Последовательность начинается с 0 и 1 поэтому current и currentt инициализируются соответственно
        int result = 0;
        int current  = 0;
        int currentt = 1;
        //Для получения результата необходимо сделать столько итераций сколько "ступенек" на входе
        //Другими словами вычислить n-е число в последовательности Фибоначи
        for (int i = 0; i < n; i++) {
            result = current + currentt;
            current = currentt;
            currentt = result;
        }
        return result;
    }
}

