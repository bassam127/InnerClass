package com.bassam.anonymous;

public class AnonumousClass {

    public interface HelloWorld{
        void greet();
        void greetSomeOne(String someOne);
    }

    public void sayHallo(){
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            @Override
            public void greet() {
                greetSomeOne(name);
            }
            @Override
            public void greetSomeOne(String someOne) {
                name = someOne;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting =  new HelloWorld() {

            String name = "tout le monde";
            @Override
            public void greetSomeOne(String someOne) {
                name = someOne;
                System.out.println("Salut " +name);
            }
            @Override
            public void greet() {
                greetSomeOne(name);
            }
        };

        HelloWorld spanishGreeting  = new HelloWorld() {

            String name = "mundo";
            @Override
            public void greetSomeOne(String someOne) {
                name = someOne;
                System.out.println("Hola, " + name);
            }

            @Override
            public void greet() {
                greetSomeOne(name);

            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeOne("freed");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        AnonumousClass myApp = new AnonumousClass();
        myApp.sayHallo();
    }

}
