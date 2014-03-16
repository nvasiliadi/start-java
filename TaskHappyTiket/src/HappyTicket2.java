
public class HappyTicket2 {


    public static int happyTicketsCount(int firstTicket, int lastTicket, int numberOfDigits)
    {
        int [] ticketIn = convertToArray(firstTicket, numberOfDigits);

        int counter = 0;

        for (int i = firstTicket; i <= lastTicket; i++)
        {
            if (isHappy(ticketIn) == true)
            {
                counter++;
            }
            incArray(ticketIn);
        }
        return counter;
    }

    public static int [] convertToArray(int number, int numberOfDigits)
    {
        int [] array = new int [numberOfDigits];

        int remaining = number;

        int i = array.length - 1;

        while ( remaining > 0 )
        {
            array [i--] = remaining % 10;

            remaining /= 10;
        }

        return array;
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

    public static void testForIsHappy(){
        int [] arrTemp = {1,2,3,1,2,3};
        assert true == isHappy(arrTemp);
    }

    public static void testForIsHappy2(){
        int [] arrTemp = {1,3,3,1,2,3};
        assert false == isHappy(arrTemp);
    }

    public static void testForHappyTicketsCount(){
        assert 1 == happyTicketsCount(1230, 1234, 4);
    }
    public static void testForConvertToArray(){
        int [] array = {1,2,3,4};
        int [] testArr = convertToArray(1234, 4);
        for(int i = 0; i < array.length; i++)
        {
            assert array[i] == testArr [i];
        }
    }

}