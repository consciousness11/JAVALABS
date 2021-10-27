/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.threadsync;

/**
 *
 * @author Marut
 */
public class Caller implements Runnable {

    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
// synchronize calls to call()

    public void run() {
        synchronized (target) { // synchronized block
            target.call(msg);
        }
    }
}
