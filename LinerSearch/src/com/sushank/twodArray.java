package com.sushank;

public class twodArray {
    static void main(String[] args) {
        int[][] arr = {
                {122,7,9,90},
                {22,8,7,9,10},
                {4,8,90,10,9}
        };
        System.out.println(Search(arr,0));

    }
    static int Search(int[][]arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if( arr[row][col] == target){
                    return 1;
                }
            }

        }
        return  -1;
    }
}
