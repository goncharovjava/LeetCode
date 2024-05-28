package org.example;

public class Solution58 {
    public static void main(String[] arg) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        //Из строки получаем массив подстрок
        String[] str = s.split(" ");
        //Начинаем с конца массива и если подстрока не равна "" то возвращаем ее длинну
        for (int i = str.length-1; i >= 0 ; i++) {
            if (!str[i].equals("")){
                return str[i].length();
            }
        }
        return 0;
    }
}