/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marut
 */
public class MainPerson {
    public static void main(String[] args) {
        try {
            Person p = new Person("Mark",3098,"kathmandu");
            FileOutputStream fos = new FileOutputStream("/java/PersonSerial.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(p);
            os.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
