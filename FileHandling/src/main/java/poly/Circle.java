/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author Marut
 */
public class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("It draws circle.");
    
    }
    @Override
    void erase(){
        System.out.println("It erases circle.");
    }
}
