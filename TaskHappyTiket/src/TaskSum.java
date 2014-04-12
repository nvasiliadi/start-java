public class TaskSum {

    public static int [] sumArr(int[] firstNumber, int [] secondNumber)
    {
        int [] arrayTemp = new int[firstNumber.length];
        int carry = 0;
        for(int i = arrayTemp.length - 1; i >= 0 ; i--)
        {

            int sum = firstNumber[i] + secondNumber[i] + carry;

            if(sum < 10)
            {
                arrayTemp[i] = sum;
                carry = 0;
            }
            else
            {
                arrayTemp[i] = sum - 10;
                carry = 1;
            }
        }
        return arrayTemp;
    }


    public static void testForSumArr(){

        int [] a = {1,2,3,4};
        int [] b = {1,2,3,7};
        int [] c = {2,4,7,1};
        assert true == compareArrays(sumArr(a,b), c);


    }

    public static boolean compareArrays(int[] a, int[] b){
        boolean result = true;
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                result = false;
                break;
            }
        }
        return result;
    }


}
