package NumeralSystem;
class Converting_Days_to_Year_Month_n_Days
{ 
    public static void main(int Number_Of_Days)
    {

        int buffer,year,month,days;
        year=Number_Of_Days/365;
        buffer=Number_Of_Days%365;
        month=buffer/30;
        days=buffer%30;

        System.out.println("The number of Years is :-\t\t"+year);
        System.out.println("The number of months is :-\t\t"+month);
        System.out.println("The number of Days is :-\t\t"+days);

    }
}