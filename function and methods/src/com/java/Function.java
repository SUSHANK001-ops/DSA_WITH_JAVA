package com.java;


import java.util.Arrays;


public class Function {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Change(arr);
        System.out.println(Arrays.toString((arr)));

    }
    static void  Change(int[] nums){
        nums[0]= 99;
    }

}
