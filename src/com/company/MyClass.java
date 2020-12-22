package com.company;

public class MyClass<T extends Number> implements MyInterface {
    private int number1;
    private int number2;

    public MyClass(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }



    @Override
    public void maths(Object value) {
        if (value == "+") {
            System.out.println(number1 + number2);
        }else if (value =="*") {
            System.out.println(number1 * number2);
        }else if (value == "/"){
            try {
                System.out.println(number1 / number2);
            }catch (ArithmeticException ignore){}
        }else {
            System.out.println(":/");
        }
    }
}
