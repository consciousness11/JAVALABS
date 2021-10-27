/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marut
 */
public class DeserializeExample {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("/java/PersonSerial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person)ois.readObject();
            
            System.out.println(p.name+p.cn+Person.address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
