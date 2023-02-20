/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author justinsam
 */
public class Recursion {
    
    //Task 1
    
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
    public static void main(String[] args) {
       countDown(1);
        
    }
}
