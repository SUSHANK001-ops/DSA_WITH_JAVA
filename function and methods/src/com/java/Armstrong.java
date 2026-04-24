package com.java;

public class Armstrong {

    static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
//        print all three digits armstrong numbers
        for (int i = 100; i<= 999;i++ ){
            if(isArmstrong(i)){
                System.out.println(i);
            }

        }
    }
    static  boolean isArmstrong(int n ){
        int original = n ;
        int sum = 0;
        while (n>0){
            int rem = n % 10 ;
            n= n/10;
            sum = sum+ rem*rem*rem;
        }

        return sum == original;
    }
}
