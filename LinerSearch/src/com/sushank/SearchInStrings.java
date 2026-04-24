package com.sushank;

public class SearchInStrings {
    static void main(String[] args) {
        String Name = "sushank";
        char target = 'u';
        System.out.println(Search(Name,target));
    }
    static  boolean Search(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
