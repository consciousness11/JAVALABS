/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.wrapper;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Marut
 */
public class DictionaryExample {
    public static void main(String[] args) {
        Dictionary dict = new Hashtable();
        
        dict.put("good", "well");
        dict.put("high","up");
        
        System.out.println(dict.get("good"));
    }
 
}
