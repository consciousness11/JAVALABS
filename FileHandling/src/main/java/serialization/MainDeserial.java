/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Marut
 */
public class MainDeserial {
    public static void main(String[] args) {
        Book bk = null;
        
        try {
            FileInputStream fis = new FileInputStream("/java/file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            bk = (Book)ois.readObject();
            System.out.println(bk.bookName +"   "+ bk.author+Book.pages);
            
        } catch (Exception e) {
        }
      
    }
}
