package com.sushank;

public class Minnum {
    static void main(String[] args) {
        int[] nums = {23,56,8,92,7,-11,22,99};
        System.out.println(findMin(nums));
    }
    static  int findMin(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}
