/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.wrapper;

import java.util.Random;

/**
 *
 * @author Marut
 */
public class RandomValues {

    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0;
        int bell[] = new int[10];
        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;
        
        for (int x = 0; x < 10; x++, t+= 0.5) {
            if (val < t) {
                bell[x]++;
                break;
            }
        }
    }

    System.out.println (
    "Average of values: " +
(sum/100));
// display bell curve, sideways
for(int i = 0; i<10; i++) {
for (int x = bell[i]; x > 0; x--) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(r.nextDouble());
    }
    }
}
