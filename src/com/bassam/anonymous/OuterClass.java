package com.bassam.anonymous;

public class OuterClass {
    int a = 10;

    class InnerClass{
        int b = 20;
    }

    public static void main(String arg[]){
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.a);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass.b);
    }

}
