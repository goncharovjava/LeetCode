package org.example;

import java.util.Arrays;

public class Solution66 {
    public static void main(String[] arg) {
        //int[] digits = {9,8,7,6,5,4,3,2,1,0};
        //int[] digits = {8,9,9,9};
        int[] digits = {9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        //Проходим массив с конца и если находим число меньше 9 увеличиваем его на 1
        //Затем с того же места идем по массиву вперед и если была девятка ставим 0 если меньше 9 увеличиваем на 1
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i] < 9){
                digits[i]++;
                for (int j = i+1; j < digits.length; j++) {
                    if (digits[j] == 9){
                        digits[j] =0;
                    }else {
                        digits[j]++;
                    }
                }
                break;
                //Если первое число равно 9 то инициализируем новый массив размером на 1 болше входного
                //Ставим первым значением 1 и остальные проставляем 0
            } else if (digits[i] == 9 && i == 0) {
                int [] result = new int[digits.length+1];
                result [0] = 1;
                for (int k = 1; k < result.length; k++) {
                    result[k] = 0;
                }
                return result;
            }
        }
        return digits;
    }
}