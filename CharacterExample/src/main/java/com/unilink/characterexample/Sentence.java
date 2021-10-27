/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.characterexample;

/**
 *
 * @author Marut
 */
public class Sentence {
    private String scen;

    /**
     * @return the scen
     */
    public String getScen() {
        return scen;
    }

    /**
     * @param scen the scen to set
     */
    public void setScen(String scen) {
        this.scen = scen;
    }
    
    void countCharacter(){
    char[] sentArr=scen.toCharArray();
    int digit=0,space=0,letter=0;
    int alpha=0;
    for(char x : sentArr){
        if (Character.isDigit(x))digit++;
        if(Character.isLetter(x))letter++;
        if(Character.isSpaceChar(x))space++;
       
       
        
    }
        System.out.println("Number of digit is "+digit++);
        System.out.println("Number of letter is "+letter++);
        System.out.println("Number of space is "+space++);
      
    }
    
    
    
}
