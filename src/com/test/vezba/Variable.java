package com.test.vezba;

public class Variable {

    public static void main(String[]args){

        int myVariable;
        myVariable = 50;
        System.out.println(myVariable);

        int anotherVariable;
        anotherVariable = 100;
        System.out.println(anotherVariable);

        myVariable = anotherVariable;
        System.out.println(myVariable);

        anotherVariable = 200;
        System.out.println(anotherVariable);

        System.out.println(myVariable + anotherVariable);


        int myVal1 = 5;
        System.out.println(++myVal1);
        System.out.println(myVal1++);
        System.out.println(myVal1);

    }
}
