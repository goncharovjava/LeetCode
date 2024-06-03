package org.example;

import java.util.Arrays;

public  class Solution88 {
    public  static void main (String[] args){
        int[] n = {0};
        int[] m = {1};
        merge(n,0,m ,1 );
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //Если m = 0 то присваеваем значения второго массива первому
        if (m == 0){
            nums1 = nums2;
            //Если n не равен 0 то добавляем в конец первого массива значения из второго
        }else if (n != 0){
            for (int i = m, j = 0; i < m+n; i++,j++) {
                nums1[i] = nums2[j];
            }
            //Сортируем массив по возрастанию
            Arrays.sort(nums1);
        }
        //Если n == 0 ничего добавлять в первый массив не надо и соответсвенно сортировать его
    }
}
