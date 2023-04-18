package org.example;

public class Interfaces {
    //Interace mit default Methoden
    interface SomeMethods{
        default void doSomething(){
            System.out.println("From Interface: doSomething");
        }

        default void doThis(){
            System.out.println("From Interface: doThis");
        }
    }

    //Klasse, die das Interface implementiert und nur doSomething ueberschreibt
    public static class SomeClass implements SomeMethods{
        public void doSomething(){
            System.out.println("From Class: doSomethingElse");
        }
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.doSomething();
        someClass.doThis();
    }
}
