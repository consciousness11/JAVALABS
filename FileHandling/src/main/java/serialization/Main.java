/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marut
 */
public class Main {
    public static void main(String[] args) {
        try {
            Book b = new Book("Computer science","Mark","Pact",502,500);
            FileOutputStream fos = new FileOutputStream("/java/file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(b);
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}
