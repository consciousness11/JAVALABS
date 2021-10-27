/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.wrapper;

import java.util.Stack;

/**
 *
 * @author Marut
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stac = new Stack<Integer>();
        
        for (int i=1 ; i<=10;i++){
            stac.push(i);
            
        }
        
        System.out.println(stac);
        System.out.println(stac.pop());
        stac.pop();
        System.out.println(stac);
    }
}
