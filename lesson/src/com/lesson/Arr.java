package com.lesson;


public class Arr {

    public static double[] arrPlus10Percents(int arrSize, double[] arrTemp){

        /*
        int[] arrTemp = new int [arrSize];
        for (arrSize = 0; arrSize < arrTemp.length; arrSize++){
            arrTemp [arrSize] = arrSize;
        }
        */
        double arrOut[] = new double [arrSize];
        for (arrSize = 0; arrSize < arrOut.length; arrSize++){
            arrOut [arrSize] = (arrTemp[arrSize])*1.1;
        }
        return arrOut;
    }
}
