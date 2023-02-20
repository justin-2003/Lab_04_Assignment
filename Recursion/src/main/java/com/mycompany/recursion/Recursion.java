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
    
    public static void main(String[] args) {
       countDown(1);
       System.out.println(gcd(5,25));
    }
}
