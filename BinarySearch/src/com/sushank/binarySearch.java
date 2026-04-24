package com.sushank;

public class binarySearch {
    static void main(String[] args) {
        int[] arr = {2, 5, 7, 12, 17, 20,22,28,30,37};
        int target = 179;
        System.out.println(binarySearch(arr,target));
    }

//   return the index

    static int binarySearch (int[] arr ,int target){
        int s = 0;
        int e = arr.length -1;
        while (s<=e){
            int mid = s + (e-s) /2 ;
            if(target< arr[mid]){
                e = mid -1;
            } else if (target> arr[mid]) {
                s = mid+1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }
}
