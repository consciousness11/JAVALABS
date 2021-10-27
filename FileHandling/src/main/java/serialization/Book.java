/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author Marut
 */
public class Book implements Serializable{
   String bookName;
   String author;
   String publisher;
   static int pages;
   int price;
   
   Book(String bookName,String author,String publisher,int pages,int price){
   this.author = author;
   this.bookName = bookName;
   this.publisher = publisher;
   this.pages = pages;
   this.price = price;
   
   }
}
