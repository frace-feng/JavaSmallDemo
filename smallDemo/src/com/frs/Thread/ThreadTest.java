package com.frs.Thread;

public class ThreadTest {

    public static void main(String[] args) {
        ThreadDemo t=new ThreadDemo();
        t.start();
        t.start();
        t.start();
    }
}
