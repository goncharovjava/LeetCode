package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution17 {
    public static void main(String[] args) {
        int[] m = {-1,2,1,-4};
        System.out.println(letterCombinations("23"));

    }
    public static  List<String> letterCombinations(String digits) {
        String[] str = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> list = new LinkedList<>();

        if(digits.length() == 0 || digits == null){
            return list;
        }

        list.add("");
        while(list.peek().length() < digits.length()){
            String s = list.poll();
            int num = digits.charAt(s.length()) - '0';
            for (char c : str[num].toCharArray()) {
                list.add(s + c);
            }
        }
        return list;
    }

}
