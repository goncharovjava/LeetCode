package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public static void main(String[] arg){
        generateParenthesis(2);
    }

    public static List<String> generateParenthesis(int n) {
        //Создание возвращаемого результата List res
        List<String> res = new ArrayList<String>();
        //Вызов рекусивного метода
        recurse(res, 0, 0, "", n);
        return res;
    }

    //Рекусивный метод
    public static void recurse(List<String> res, int left, int right, String s, int n){
        if(s.length() == n * 2){
            res.add(s);
            return;
        }

        if(left < n){
            recurse(res, left + 1, right, s + "(", n);
        }

        if(right < left){
            recurse(res, left, right+ 1, s + ")", n);
        }
    }
}
