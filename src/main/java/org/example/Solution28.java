package org.example;

public class Solution28 {
    public static void main(String[] rgs ){
        System.out.println(strStr("string","str"));
    }
    public static int strStr(String haystack, String needle) {
        //Есть замечатьльный метод String который вернет индекс первого вхождения подстроки в строку
        return haystack.indexOf(needle);
    }
}

