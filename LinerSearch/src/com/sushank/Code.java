package com.sushank;

public class Code {
    static void main(String[] args) {
        int[] nums = {23,56,8,92,7,-11,22,99};
        int target = 99;
        int ans = linerSeach(nums,target);
        System.out.println(ans);
    }
//    Search in the array
    static int linerSeach(int[]arr , int targer){
        if(arr.length == 0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == targer){
                return i;
            }
        }
        return  -1;
    }

}
