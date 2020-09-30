package WrapperClass;
public class PrimitivetoString
{
    void IntegertoString()
    {
        int ex=2014;
        String exToString=Integer.toString(ex);
        System.out.println("The Integer Conversion from Integer (ex) is "+exToString);
    }

    void LongtoString ()
    {
        long ex=201420152;
        String exToString=Long.toString(ex);
        System.out.println("The String Conversion from Long (ex) is "+exToString);
    }

    void FloattoString ()
    {
        //         float ex=24.02;
        //         String exToString=Float.toString(ex);
        //         System.out.println("The String Conversion from Float (ex) is "+exToString);
    }

    void DoubletoString ()
    {
        double ex=2014.564654;
        String exToString=Double.toString(ex);
        System.out.println("The String Conversion from Double (ex) is "+exToString);
    }
}