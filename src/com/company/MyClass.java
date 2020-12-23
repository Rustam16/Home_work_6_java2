package com.company;

public class MyClass<T extends Number> implements MyInterface {
    private int number1;
    private int number2;


    public MyClass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }



    @Override
    public void maths(Object o, Object o2) {
        System.out.println(number1 + " + " + number2+ " = "+ (number1+number2));
    }
}
