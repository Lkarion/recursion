package com.company;

public class characterSet {
    //Given a set of characters and a positive integer k, print all possible strings of length k that can be formed from the given set.
    //
    //Examples:
    //
    //Input:
    //set[] = {'a', 'b'}, k = 3
    //
    //Output:
    //aaa
    //aab
    //aba
    //abb
    //baa
    //bab
    //bba
    //bbb
    //
    //
    //Input:
    //set[] = {'a', 'b', 'c', 'd'}, k = 1
    //Output:
    //a
    //b
    //c
    //d
    //For a given set of size n, there will be n^k possible strings of length k. The idea is to start from an empty
    // output string (we call it prefix in following code). One by one add all characters to prefix. For every
    // character added, print all possible strings with current prefix by recursively calling for k equals to k-1.
    public static void main(String[] args) {

    }

}
