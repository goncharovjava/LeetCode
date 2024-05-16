package org.example;

import java.util.HashMap;

public class Solution2 {
    static public void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }

    static public int romanToInt(String s){
        //Метод принимает на вход римское число, возвращает арабское
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //Логика: проходим по строке с конца и если следующий знак больше предидущего добавляем его к результату
        //иначе вычетаем его из рещультата
        int result = 0;
        int prev = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            int x = map.get(s.charAt(i));
            if (x >= prev){
                result += x;
            }else{
                result -= x;
            }
            prev = x;

        }
        return result;
    }

}

