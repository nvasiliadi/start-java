
public class Converter {
    public static String converter(String data, int inputSystem, int outputSystem){
        String test = null;
        return test;
    }

    public static void testConversion()
    {
        assert new String("null").equals(Converter.converter("null", 16, 10));
        assert "10".equals(converter("a", 16, 10));
        assert "11" == converter("b", 16, 10);
    }

    public static void testArgumentsValidation()
    {
        assert null == converter(null, 0, 0);
        assert null == converter(null, 16, 0);
        assert null == converter(null, 16, 0);
        assert null == converter(null, 15, 15);
        assert null == converter(null, 15, -1);
    }

    public static void main(String[] args){
        testConversion();
        testArgumentsValidation();
    }

}