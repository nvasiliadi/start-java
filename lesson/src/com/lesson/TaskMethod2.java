package com.lesson;

public class TaskMethod2 {

    public static int happyTicketsCount()
    {
        final int MAX_TICKET = 999999;

        int [] ticketIn = {0, 0, 0, 0, 0, 0};

        int counter = 0;

        for (int i = 0; i <= MAX_TICKET; i++)
        {
            if (isHappy(incArray(ticketIn)) == true)
            {
                counter++;
            }
        }
        return counter;
    }

    public static int[] incArray(int[] in)
    {
        int[] array = in;

        for (int i = array.length - 1; i >= 0; i--)
        {
            array[i]++;

            if (10 == array[i])
            {
                array[i] -= 10;
            }
            else
            {
                break;
            }
        }

        return array;
    }

    public static boolean isHappy (int [] ticket)
    {
        boolean result = false;

        if (ticket.length % 2 == 0)
        {
            int sumLeft = 0;

            int sumRight = 0;

            for (int i = 0; i < ticket.length/2; i++)
            {
                sumLeft += ticket[i];
            }
            for (int i = ticket.length/2; i < ticket.length; i++)
            {
                sumRight += ticket[i];
            }
            result = sumLeft == sumRight;
        }
        return result;
    }


    public static void testForIsHappy()
    {
        int [] arrTemp = {1,2,3,1,2,3};
        assert true == isHappy(arrTemp);
    }

    public static void testForIsHappy2()
    {
        int [] arrTemp = {1,3,3,1,2,3};
        assert false == isHappy(arrTemp);
    }
}