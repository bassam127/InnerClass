package com.bassam.anonymous;

public class InnerStaticClass {

    int a = 10;

    public static  class InnerClass{
        int b = 100;
    }

    public static void main(String arg[]){
        InnerStaticClass.InnerClass innerClass = new InnerStaticClass.InnerClass();

        System.out.println(innerClass.b);
    }
}
