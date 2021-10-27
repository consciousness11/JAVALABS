/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.stringsort;

import java.util.Arrays;

/**
 *
 * @author Marut
 */
public class SSort {
    public static void main(String[] args) {
        String[] cities = {"kathmandu","pokhara","chitwan","biratnagar","birgunj"};
        int size = cities.length;
        for(int i = 0;i<size;i++){
            for(int j=i+1;j<size;j++){
            if(cities[i].compareTo(cities[j])>0){
            String tmp = cities[i];
            cities[i]=cities[j];
            cities[j]=tmp;
            
            }
            }
        }
        System.out.println(Arrays.toString(cities));
        
    }
}
