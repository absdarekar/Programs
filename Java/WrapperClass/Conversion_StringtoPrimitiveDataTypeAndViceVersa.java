package WrapperClass;
public class Conversion_StringtoPrimitiveDataTypeAndViceVersa
{
    public static void main (String atharv[])
    {
        StringtoPrimitive obj=new  StringtoPrimitive();
        PrimitivetoString obj1=new PrimitivetoString();
        obj.StringtoInteger();
        obj.StringtoLong();
        obj.StringtoFloat();
        obj.StringtoDouble();
        obj1.IntegertoString();
        obj1.LongtoString();
        obj1.FloattoString();
        obj1.DoubletoString();
    }
}