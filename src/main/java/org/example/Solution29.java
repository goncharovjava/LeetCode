package org.example;

public class Solution29 {
    public static void main(String[] arg) {
        System.out.println(divide(7, -3));

    }

    public static int divide(int dividend, int divisor) {
        long result = 0;
        if (dividend < 0 && divisor < 0){
            while (dividend != 0) {
                dividend -= divisor;
                result++;
            }
        }else if (dividend < 0 || divisor < 0) {
            long current = dividend + dividend;
            while (dividend < current || dividend != 0) {
                dividend -= divisor;
                result--;
            }
        } else {
            while (dividend >= divisor) {
                dividend -= divisor;
                result++;
            }
        }

        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE){
            return (int)result;
        }else {
            return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
}