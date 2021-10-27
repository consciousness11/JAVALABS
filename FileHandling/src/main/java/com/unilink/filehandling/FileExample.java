/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Marut
 */
public class FileExample {

    public static void main(String[] args) throws IOException {
        FileReader source = null; // reference source object
        try { 
            source = new FileReader("/java/COPYRIGHT.txt");
            //initialization inside try block
            int temp; // read returns integer value 
            while ((temp = source.read()) != -1) {
                System.out.println((char) temp);// convert temp to char
            }

        } finally {
            if (source != null) {
                source.close();
            }
        }

    }
}
