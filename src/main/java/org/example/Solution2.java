package org.example;

import java.util.HashMap;

public class Solution2 {
    static public void main(String[] args){
        System.out.println(romanToInt("LVIII"));
    }

    static public int romanToInt(String s){
        //Метод принимает на вход римское число, возвращает арабское
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);






        return 0;
    }
}
