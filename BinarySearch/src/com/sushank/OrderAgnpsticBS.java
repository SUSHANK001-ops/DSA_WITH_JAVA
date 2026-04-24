package com.sushank;

public class OrderAgnpsticBS {
    static void main(String[] args) {
        int[] asc = {1,6,8,12,15,18,19,20,44,55,67,69,100};
        int[] dsc = {100,89,88,80,79,77,76,69,58,45,35,20};
        int target =  44;
        System.out.println(OrderAgnosticBs(asc,target));
    }
    static  int OrderAgnosticBs(int[]arr ,int target){
        int s = 0;
        int e = arr.length -1;
        boolean isAsc = arr[s]<arr[e];

        while (s<=e){
            int mid = s + (e-s) /2 ;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc)
            {
                if(target < arr[mid]){
                    e = mid -1;
                } else if (target> arr[mid]) {
                    s = mid+1;
                }
            }
            else {
                if(target > arr[mid]){
                    e = mid -1;
                } else if (target> arr[mid]) {
                    s = mid+1;
                }
            }


        }
        return  -1;
    }

}
