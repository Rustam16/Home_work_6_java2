package com.company;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {

        MyClass<Integer> value1= new MyClass< >(2,4);
        value1.maths("*");
        value1.maths(" ");

        MyClass<Long> value2= new MyClass<>(39,4);
        value2.maths("+");
        value2.maths("/");
    }
}