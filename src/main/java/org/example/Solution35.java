package org.example;

public class Solution35 {
    public static void main(String[] arg){
        int[] nums ={1,3,5,6};
        int target =7;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        //Проверяем меньше ли target первого значения в массиве
        if (target < nums[0]){
            return 0;
        //Проверяем равно ли target первому значению в массиве
        } else if (target == nums[0]) {
            return 0;
        //Проверяем больше ли target последнего значения в массиве
        } else if (target > nums[nums.length-1]){
            return nums.length;
        }else {
            for (int i = 1; i < nums.length; i++) {
                //Если nums[i] = target вернуть i
                if (nums[i] == target){
                    return i;
                //проверяем между какими значениями можно разместить target
                } else if (target < nums[i] && target > nums[i-1]) {
                    return i;
                }
            }
        }
        //Если ничего не сработало по какой-то причине))
        return 0;
    }
}

