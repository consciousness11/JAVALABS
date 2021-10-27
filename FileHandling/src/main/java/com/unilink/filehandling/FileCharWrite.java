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
public class FileCharWrite {

    public static void main(String args[]) throws IOException {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.बकमान";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);
        FileWriter f0 = new FileWriter("/java/file1.txt");
        for (int i = 0; i < buffer.length; i += 2) {
            f0.write(buffer[i]);
        }
        f0.close();
        FileWriter f1 = new FileWriter("/java/file2.txt");
        f1.write(buffer);
        f1.close();
        FileWriter f2 = new FileWriter("/java/file3.txt");
        f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        f2.close();
    }
}
