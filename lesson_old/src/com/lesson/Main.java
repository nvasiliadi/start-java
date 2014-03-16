package com.lesson;


public class Main {

    public static void main(String[] args){

        TaskMethod2.action2();

        Field field = new Field();
        field.eraseField();
        field.showField();

        TaskMethod1.assertForResult();
        double otvet = TaskMethod1.result(52,34);
        System.out.println(otvet);

        double otvetTernarnij = TaskMethod1.resultTernarnij(52,34);
        System.out.println(otvetTernarnij);

        Arr.testForArray();
        Integer a = new Integer(500);
        Integer b = new Integer(500);
        TaskMethod2.action3(a, b);
        System.out.println(a + "  a  " + b);





        //double[] element = Arr.arrPlus10Percents(10, new double[] {0,1,2,3,4,5,6,7,8,9});
        //System.out.print(element[4]);



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
