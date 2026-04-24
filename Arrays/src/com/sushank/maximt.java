package com.sushank;

public class maximt {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
//        System.out.println(max(arr));
        System.out.println(inrange(arr, 0, 5));
    }
//    static  int max(int[] arr){
////        int maxit = arr[0];
////        for (int j : arr) {
////            if (maxit < j) {
////                maxit = j;
////            }
////        }
////        return maxit;
////    }
    static  int inrange(int []arr , int start , int end){
        int maxval = arr[start];
        for (int i = start; i <end ; i++) {
            if(maxval<i){
                maxval = i;
            }

        }
        return  maxval;
    }
}
