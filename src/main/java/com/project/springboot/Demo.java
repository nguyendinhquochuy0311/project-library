package com.project.springboot;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        hh(0);
    }

    public static void hh(int a) {
        System.out.println("ahihi "+a);
        if(a>1000000){
            return;
        }
        a++;
        hh(a);
    }
}
