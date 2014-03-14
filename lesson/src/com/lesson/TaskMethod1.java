package com.lesson;


public class TaskMethod1 {


    //ниже метод с операторами if else
    public static double result(double a, double b){
        if(a > b){
            return a - b;
        }
            if (a < b){
                return a + b;
            }
                else {
                    return a / b;
                }
    }

    //ниже метод с тернарным оператором
    public static double resultTernarnij(int a, int b){
        return (a > b) ? (double) a - b : (a < b) ? (double) a + b : (double ) a / b;
        }
    //ниже тесты для метода резалт
    public static void assertForResult(){
        assert 10 == result(20, 10);
        assert 30 == result(10, 20);
        assert 1 == result(10, 10);
    }

    //ниже тесты для метода резалтТернарний
    public static void assertForResultTernarnij(){
        assert 10 == resultTernarnij(20, 10);
        assert 30 == resultTernarnij(10, 20);
        assert 1 == resultTernarnij(10, 10);
    }

}
