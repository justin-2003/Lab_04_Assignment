/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author justinsam
 */
public class Recursion {
    
    //TASK 1
    
    static void countDown(int num){
    
    if(num%2 == 0){ // it checks it's num is even or odd by seeing if the remainder is 0(means its even).
    
        if(num == 0){
            System.out.println("Blastoff!");
        }else{
            System.out.println("...");
            countDown(num - 1);
        } 
    }else{ //if the num is not even then it will subtract one.
        countDown(num - 1);
        }
    }
    
    
    //TASK 2
    
    static int gcd(int x, int y){
        if(x==y){
            return y; // if they are equal then that's the biggest divisor.
        }else if (x > y) {
            return gcd(x - y, y); // substracts x - y, and calls the function recursively.
        } else {
            return gcd(x, y - x); // substracts y - x, and calls the function recursively.
        }
    }
    
    //TASK 3
    
    int fib(int n){
       if (n <= 0){ // base case
            return 0;
       }else if (n == 1){ // base case
             return 1;
       }else{
             return fib(n-1) + fib(n-2);
       }
}
    
    // Following Problems
    // No: 1
    
    static void numberOne(int n){
    if(n > 0){
       System.out.println("Hello World!");
       numberOne(n-1);
    }
}
    //No: 2
    
    public static int sumMultiplesOfSeven(int n1, int n2) {
        if (n1 > n2) {
            return 0; //if n1 is greater than n2, return 0
        } else {
            if (n1 % 7 == 0) {
                return n1 + sumMultiplesOfSeven(n1 + 7, n2); // If n1 is a multiple of 7, add it to the sum and recurse with n1 + 7
            } else {
                return sumMultiplesOfSeven(n1 + 1, n2); // If n1 is not a multiple of 7, recurse with n1 + 1
            }
        }
    }

    
    public static void main(String[] args) {
       countDown(1);
       System.out.println(gcd(5,25));
       numberOne(10);
       System.out.println(sumMultiplesOfSeven(48,25));
    }
}
