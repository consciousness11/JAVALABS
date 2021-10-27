/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.characterexample;

import java.util.Scanner;

/**
 *
 * @author Marut
 */
public class Main {
    public static void main(String[] args) {
        Sentence s = new Sentence();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str = sc.nextLine();
        s.setScen(str);
        s.countCharacter();
    }
}
