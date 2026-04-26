package com.sushank;

public class InfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,10,22,33,35,37,39,44,55,66,77,88,99,111,222,333,444,555,666,777,888,999,1000};
        System.out.println(ans(arr, 111));
    }

    static int ans(int[] arr, int target) {
        int s = 0;
        int e = 1;

        while (e < arr.length && target > arr[e]) {
            int newS = e + 1;
            e = e + (e - s + 1) * 2;
            s = newS;
        }

        return binarySearch(arr, s, e, target);
    }

    static int binarySearch(int[] arr, int s, int e, int target) {

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (target < arr[mid]) {
                e = mid - 1;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}