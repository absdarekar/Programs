package StringManipulation;
class All_String_Functions
{
    void lengthOfString()
    {
        System.out.println("This is length() function");
        String s= "Atharv";
        int n;
        n=s.length();
        System.out.println(n);
    }

    void charAtFunction()
    {
        System.out.println("This is charAt() function");
        String s="Atharv";
        char c=s.charAt(4);
        System.out.println(c);
    }

    void indexOfFunction()
    {
        System.out.println("This is indexOf() function");
        String s="Atharv";
        int n= s.indexOf('a');
        System.out.println(n);
    }

    void lastIndesOfFunction()
    {
        System.out.println("This is lastIndexOf() function");
        String s="Atharv";
        int n=s.lastIndexOf('a');
        System.out.println(n);
    }

    void subStringFunction()
    {
        System.out.println("This is substring() function");
        String s="AtharvDarekar";
        String s1=s.substring(5);
        String s2=s.substring(5,13);
        System.out.println(s1);
        System.out.println(s2);
    }

    void toLowerCaseFunction()
    {
        System.out.println("This is toLowerCase() function");
        String s="Atharv";
        String s1=s.toLowerCase();
        System.out.println(s1);
    }

    void toUppercaseFunction()
    {
        System.out.println("This is toUpperCase() function");
        String s="Atharv";
        String s1=s.toUpperCase();
        System.out.println(s1);
    }

    void replaceFunction()
    {
        System.out.println("This is replace() function");
        String s="Atharv";
        String s1=s.replace("Atharv", "Darekar Atharv");
        System.out.println(s1); 
        String s2="Atharv";
        String s3=s.replace('v', 'w');
        System.out.println(s3);
    }

    void concatFunction()
    {
        System.out.println("This is concat() function");
        String s="Atharv";
        String s1="Darekar";
        String s2=s.concat(s1);
        System.out.println(s2);
    }

    void equalsFunction(){
        System.out.println("This is equals() function");
        String s="Atharv";
        String s1="Atharv";
        boolean b=s.equals(s1);
        System.out.println(b);
    }

    void equalsIgnoreCaseFunction()
    {
        System.out.println("This is equalsIgnoreCase() function");
        String s="Atharv";
        String s1="ATHARV";
        boolean b=s.equalsIgnoreCase(s1);
        System.out.println(b);
    }

    void compareToFunction()
    {
        System.out.println("This is compareTo() function");
        String s="a";
        String s1="A";
        int n=s.compareTo(s1);
        System.out.println(n);
    }

    void trimFunction()
    {
        System.out.println("This is trim() function");
        String s="              Atharv Darekar       ";
        String s1=s.trim();
        System.out.println(s1);
    }

    void endsWithFunction()
    {
        System.out.println("This is endsWith() function");
        String s= "Java Programming is Scoring Subject";
        String s1= "Subject";
        boolean b=s.endsWith(s1);
        System.out.println(b);
    }

    void startWithFunction()
    {
        System.out.println("This is startsWith() function");
        String s= "Java Programming is Scoring Subject";
        String s1= "Java";
        boolean b=s.startsWith(s1);
        System.out.println(b);
    }
}