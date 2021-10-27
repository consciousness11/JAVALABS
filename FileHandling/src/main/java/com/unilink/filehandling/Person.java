/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.filehandling;

import java.io.Serializable;

/**
 *
 * @author Marut
 */
public class Person  implements Serializable{
    String name ;
    Integer cn;
    static String address;
   
    Person(String name,int cn,String address){
    this.name = name;
    this.cn = cn;
    this.address = address;
    
    
    }
}
