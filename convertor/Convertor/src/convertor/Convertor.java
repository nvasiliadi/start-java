package convertor;




public class Convertor {
    public static String convertor(String data, int inputSystem, int outputSystem){
        String test = null;
        return test;
    }

    public static int backBiggestNumber (int firstNumber, int secondNumber){
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }
    
    public static void testBiggest()
    {
        assert 2 == backBiggestNumber(1,2);
        assert 4 == backBiggestNumber(3,4);
        assert 6 == backBiggestNumber(5,6);
        assert 8 == backBiggestNumber(7,8);   
    }

    public static void testSmallest()
    {
        assert 2 == backBiggestNumber(1,2);
        assert 4 == backBiggestNumber(3,4);
        assert 6 == backBiggestNumber(5,6);
        assert 8 == backBiggestNumber(7,8);   
    }
    
    public static void testArgumentsValidation()
    {
        assert null == convertor(null, 0, 0);
        assert null == convertor("aaaa", 16, 0);
        assert null == convertor("aaaa", 16, 0);
        assert null == convertor(null, 15, 15);
        assert null == convertor(null, 15, -1);
    }

    public static void testConversion()
    {
        assert "10" == convert("a", 16, 10);
        assert "10" == convert("a", 16, 10);
    }
    
    public static void main(String[] args) 
    {
        testBiggest();
        testSmallest();
        testArgumentsValidation();
    }
    
}
