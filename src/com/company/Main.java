package com.company;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {

        MyClass<Integer> value1= new MyClass< >(2,4);
        value1.maths(value1.getNumber1(), value1.getNumber2());
        //value1.maths(value1.getNumber1(),value1.getNumber2());

        MyClass<Long> value2= new MyClass<>(39,4);
        value2.maths(value2.getNumber1(),value2.getNumber2());
        //value2.maths(value2.getNumber1(), value2.getNumber2());
    }
}