/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unilink.addressbook.UI;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Marut
 */
public class LModel {

    private DefaultListModel listmodel;

    public LModel() {
        listmodel = new DefaultListModel();
        String[] mList = new String[]{"xyz@abc.com", "admin@abc.com"};
        for (int i = 0; i < mList.length; i++) {
            listmodel.add(i, mList[i]);
        }
    }
    
    public ListModel getListModel(){
    return listmodel;
    }
    
    public void setListModel(String str){
     
        listmodel.add(listmodel.getSize()-1,str);
    }
}
