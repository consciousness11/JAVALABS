/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author Marut
 */
public class Dog extends Animal{
    @Override
    void breathe(){
        System.out.println("brethe through lungs ");
    }
}
