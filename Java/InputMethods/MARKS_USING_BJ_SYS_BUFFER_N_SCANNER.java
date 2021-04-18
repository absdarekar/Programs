package InputMethods;
import java.io.*;
import java.util.*;
public class MARKS_USING_BJ_SYS_BUFFER_N_SCANNER
{
    public static void main(double eng1,double math,double eng2,double hin,double bio,double chem,double phy,double hici,double geo,double comp,String name)throws IOException
    {
        //using bluej system
        double per,total,avg;
        String name2,name3;
        System.out.println(name);
        System.out.println("Marks obtain in English I is\t\t"+eng1+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in English II is\t\t"+eng2+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Hindi is\t\t"+hin+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Mathematics is\t\t"+math+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Physics is\t\t"+phy+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Chemestry is\t\t"+chem+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Biology is\t\t"+bio+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in History & Civics is\t"+hici+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Geography is\t\t"+geo+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Computer is\t\t"+comp+"/50 in I Unite Test 2014-15");
        total=eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo;
        System.out.println("Total of all the subjects is\t\t"+total);
        avg=(eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo)/10;
        System.out.println("Average of all Subjects is\t\t"+avg);
        per=total/410*100;
        System.out.println("Percentage Obtained is\t\t\t"+per);
        System.out.println("");
        //using buffer reader
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Name:");
        name2=A.readLine();
        System.out.println("Enter Your Marks For English-I");
        eng1=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For English-II");
        eng2=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Hindi");
        hin=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Mathematics");
        math=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Physics");
        phy=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Chemestry");
        chem=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Biology");
        bio=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For History & Civics");
        hici=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Geography");
        geo=Double.parseDouble(A.readLine());
        System.out.println("Enter Your Marks For Computer");
        comp=Double.parseDouble(A.readLine());
        System.out.println("");       
        System.out.println(name2);
        System.out.println("Marks obtain in English I is\t\t"+eng1+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in English II is\t\t"+eng2+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Hindi is\t\t"+hin+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Mathematics is\t\t"+math+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Physics is\t\t"+phy+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Chemestry is\t\t"+chem+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Biology is\t\t"+bio+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in History & Civics is\t"+hici+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Geography is\t\t"+geo+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Computer is\t\t"+comp+"/50 in I Unite Test 2014-15");
        total=eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo;
        System.out.println("Total of all the subjects is\t\t"+total);
        avg=(eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo)/10;
        System.out.println("Average of all Subjects is\t\t"+avg);
        per=total/410*100;
        System.out.println("Percentage Obtained is\t\t\t"+per);
        System.out.println("");
        //using scanner function
        Scanner B=new Scanner(System.in);

        System.out.println("Enter your Name:");
        name3=B.next();
        System.out.println("Enter Your Marks For English-I");
        eng1=B.nextDouble();
        System.out.println("Enter Your Marks For English-II");
        eng2=B.nextDouble();
        System.out.println("Enter Your Marks For Hindi");
        hin=B.nextDouble();
        System.out.println("Enter Your Marks For Mathematics");
        math=B.nextDouble();
        System.out.println("Enter Your Marks For Physics");
        phy=B.nextDouble();
        System.out.println("Enter Your Marks For Chemestry");
        chem=B.nextDouble();
        System.out.println("Enter Your Marks For Biology");
        bio=B.nextDouble();
        System.out.println("Enter Your Marks For History & Civics");
        hici=B.nextDouble();
        System.out.println("Enter Your Marks For Geography");
        geo=B.nextDouble();
        System.out.println("Enter Your Marks For Computer");
        comp=B.nextDouble();
        System.out.println("");
        System.out.println(name2);
        System.out.println("Marks obtain in English I is\t\t"+eng1+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in English II is\t\t"+eng2+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Hindi is\t\t"+hin+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Mathematics is\t\t"+math+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Physics is\t\t"+phy+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Chemestry is\t\t"+chem+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Biology is\t\t"+bio+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in History & Civics is\t"+hici+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Geography is\t\t"+geo+"/40 in I Unite Test 2014-15");
        System.out.println("Marks obtain in Computer is\t\t"+comp+"/50 in I Unite Test 2014-15");
        total=eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo;
        System.out.println("Total of all the subjects is\t\t"+total);
        avg=(eng1+eng2+hin+hici+math+bio+chem+phy+comp+geo)/10;
        System.out.println("Average of all Subjects is\t\t"+avg);
        per=total/410*100;
        System.out.println("Percentage Obtained is\t\t\t"+per);

    }
}