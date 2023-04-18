package org.example;

public class Lambda {

    //Interface definieren für die Lambda Methode. Das ist ein funktionales Interface
    @FunctionalInterface

    interface MathOperation{
        int operation(int a, int b);
    }

    //Methode, die die Lambda Methode als Parameter übernimmt
    public int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {
        //Lambda Methode definieren
        MathOperation addition = (int a, int b) -> a + b;

        //Lambda Methode ausfuehren
        int result = addition.operation(1, 2);

        //Ergebnis ausgeben
        System.out.println(result);
    }
}
