package com.lesson;


public class TaskMethod1 {

    public static double result(int a, int b){
        if(a > b){
            return (double) a - b;
        }
        if(a < b){
            return a + b;
        }
        else{
            return a / b;
        }
    }

    public static double resultTernarnij(int a, int b){
        return (a > b) ? (a - b) : (a < b) ? (a + b) : (double) a / b;
        }

    public static void assertForResult(){
        assert 35 == result(13,22);
       // assert 2 == result(20,10);
    }

}
