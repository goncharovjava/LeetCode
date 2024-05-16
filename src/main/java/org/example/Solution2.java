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
    public int romanTInt(String s) {
        //А через Switch все работает побыстрее
        int arr[] = new int[s.length()];
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            int n = 0;
            char a = s.charAt(i);
            switch (a){
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }
            if(k > 0){
                if(arr[k-1] < n) {
                    arr[k] = n;
                    arr[k-1] = -arr[k-1];
                }
                else arr[k] = n;
            }else arr[k] = n;
            k++;
        }
        int sum = 0;
        for(int c : arr) sum += c;

        return sum;
    }
}

