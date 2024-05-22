package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class Solution4 {
    public static void main(String[] args){
        String[] s = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix("([}}])"));
    }
    public static boolean longestCommonPrefix(String s) {
        //Проверка на ноль
        if(s.length()%2 != 0){
            return false;
        }
        //Создание стэка
        Stack<Character> stack = new Stack<>();
        //Проходим по строке извелекая символы если они "({[" то ложим их в стек
        //Если они ")}]" и соответствуют типу уже лежащей в не пустом стеке
        //То удаляем из стека и дем дальше
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (c == ')' && !stack.isEmpty() &&stack.peek() == '(') {
                    stack.pop();
                }
                if (c == ']'&& !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                }
                if (c == '}'&& !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                }

            }

        }
        //Если каждая скобка будет парной то стек будет пуст
        return stack.isEmpty();

}
}
