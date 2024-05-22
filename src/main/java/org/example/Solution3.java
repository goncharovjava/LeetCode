package org.example;

public class Solution3 {
    public static void main(String[] args){
        String[] s = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        //Проверка на пустооту массива
        if(strs==null || strs.length==0){
            return "";
        }

        //Выносим первое значение массива по которому будем искать
        String prefix=strs[0];
        //Проходим по массиву начиная со втророго значения
        for(int i=1;i<strs.length;i++){
            //пока не найдется совпадение уменьшаем длину строки prefix
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                //Если уменьшили длину строки prefix до нуля
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;


    }
}