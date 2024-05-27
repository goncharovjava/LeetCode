package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Solution26 {
    static public void main(String[] args){
        int[] nums = {-3,-1,-1};
        System.out.println(removeDuplicates(nums));

    }



    public static int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] current = new int[nums.length];

        stack.push(nums[0]);
        current[0] = nums[0];
        //Добавляем во временный массив уникальные значения из num
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(stack.peek() != nums[i]){
                current[count] = nums[i];
                stack.push(nums[i]);
                count++;
            }
        }





        int result = 1;
        nums[0] = current[0];
        //Если длиннна массива ровна 1 то вернуть результат
        if (nums.length == 1){
            return result;
        //иначе переписать массив num
        }else {
            for (int i = 1; i < current.length; i++) {
                if (i < count){
                    nums[i] = current[i];
                    result++;
                }else {
                    nums[i] = current[i];
                }
            }

        }
        return result;
    }
}
