package com.lesson;


public class TaskMethod2 {

    public static void assertForAction(){
        assert 32 == action(10, 20);
    }

    public static int action(int a, int b){
        a++;
        b++;
        return (a + b);
    }

    public static void assertForAction2(){
        assert 12 == action(5, 5);
    }

    public static void action2(){
        int x = 5;
        int y = 5;
        action(x, y);
    }


    public static void action3(Integer a, Integer b){
        if(null != a && null != b){
            a++;
            b++;
        }
    }
}

