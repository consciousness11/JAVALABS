/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marut
 */
public class FileW {
    public static void main(String[] args) {
        try {
        FileWriter writer = new FileWriter("/java/t.txt",true);
        writer.write("Hello");
        writer.close();
        }
        catch(IOException ex) {
        ex.printStackTrace();
        }
    }
}
