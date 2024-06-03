package org.example;

public  class Solution70 {
    public static void main(String[] arg){
        System.out.println(climbStairs(40));
    }
    public static int climbStairs(int n) {
        //Применение чисел фибоначи...
        //Нужно произвести столько итераций сколько ступеней на входе.
        //Числа Фибоначи начинаются с 0 и 1 по этому current и currentt инициализируем по умолчанию 0 и 1
        int result = 0;
        int current  = 0;
        int currentt = 1;
        for (int i = 0; i < n; i++) {
            result = current + currentt;
            current = currentt;
            currentt = result;

        }
        return result;

    }
}
