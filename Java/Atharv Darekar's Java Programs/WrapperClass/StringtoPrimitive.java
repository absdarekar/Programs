package WrapperClass;
public class StringtoPrimitive
{
    void StringtoInteger()
    {
        String ex="2014";
        int exToint=Integer.parseInt(ex);
        System.out.println("The Integer Conversion from String (ex) is "+exToint);
    }

    void StringtoLong ()
    {
        String ex="201420152";
        long exTolong=Long.parseLong(ex);
        System.out.println("The Long Conversion from String (ex) is "+exTolong);
    }

    void StringtoFloat ()
    {
        String ex="2014.2015";
        float exTofloat=Float.parseFloat(ex);
        System.out.println("The Float Conversion from String (ex) is "+exTofloat);
    }

    void StringtoDouble ()
    {
        String ex="2014.564654";
        double exTodouble=Double.parseDouble(ex);
        System.out.println("The Double Conversion from String (ex) is "+exTodouble);
    }
}
