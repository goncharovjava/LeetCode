
package org.example;

public class Solution {
    public static void main(String[] args) {
        System.out.println(3781);
    }
    public static String intToRoman(int num){
        //метод принимает на вход арабские цифры, возвращает римские
        int[] n = {1000, 900, 500, 400, 100, 90, 50, 40, 10 ,9, 5, 4, 1};
        String[] str = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder result = new StringBuilder();

        //проверка входного параметра
        if (num <= 0 || num > 3999){
            return null;
        }

        return result.toString();
    }
}