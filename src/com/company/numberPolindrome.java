package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class numberPolindrome {
    //Given an integer, write a function that returns true if the given number is palindrome, else false.
    // For example, 12321 is palindrome, but 1451 is not palindrome.
    public static void main(String[] args) {
        int number = 2324232;
        System.out.println("number "+ number+" is polindrome -> " + ifPolindrome(number));
    }

    private static boolean ifPolindrome(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        while(number>0){
            list.add(number%10);
            number/=10;
        }
        System.out.println(list.toString());
        return ifPolindromeList(list);

    }

    public static boolean ifPolindromeList(ArrayList<Integer> list){
        if (list.size() <=1)
            return true;
        if (list.get(0) == list.get(list.size()-1)) {
            list.remove(0);
            list.remove(list.size()-1);
            System.out.println("after removing: "+list.toString());
            ifPolindromeList(list);
        }else return false;
        return true;
    }

}
