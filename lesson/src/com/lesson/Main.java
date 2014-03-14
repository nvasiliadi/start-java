package com.lesson;


public class Main {

    public static void main(String[] args){
        Field field = new Field();

        field.eraseField();
        field.showField();


        int happy = TaskMethod2.happyTicketsCount();
        System.out.println(happy);







        //int a = TaskMethod2.action2(1, 2);
        //System.out.print("a = " + a);







        /*
        ExampleStaticClass exampleStaticClass = new ExampleStaticClass();
        exampleStaticClass.nonStaticField = 4;
        ExampleStaticClass.staticField = 4;

        ExampleStaticClass exampleStaticClass2 = new ExampleStaticClass();
        exampleStaticClass2.nonStaticField = 5;
        ExampleStaticClass.staticField = 5;

        System.out.println(exampleStaticClass.nonStaticField + ", " + exampleStaticClass2.nonStaticField);
        System.out.println(ExampleStaticClass.staticField + ", " + ExampleStaticClass.staticField);

        ExampleStaticClass.hello2();
        */


    }


}
