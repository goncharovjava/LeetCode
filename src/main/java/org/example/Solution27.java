package org.example;

import java.util.Arrays;

public class Solution27 {
    static public void main(String[] args){
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, 2));

    }



    public static int removeElement(int[] nums, int val) {
        //Проверка входного массива на 0
        if (nums.length == 0){
            return 0;
        }


        //Заменяем во входном массиве значение val значением выше проверочного
        int current = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                current++;
                result++;
            }else {
                nums[i] = 51;
            }
        }

        //Сортируем массив в порядке возрастания
        Arrays.sort(nums);
        //заменяем все значения 51 нулями
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 51){
                nums[i] = 0;
            }
        }
        return result;




    }
}