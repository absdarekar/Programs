package InputMethods;
public class MARKS_COMMAND_LINE
{  public static void main (String atharv[])
    {
        double eng1, math, eng2, hin, bio, chem, phy, hici, geo, comp,total,avg,per; String name;
        eng1=Double.parseDouble(atharv[0]); 
        math=Double.parseDouble(atharv[1]); 
        eng2=Double.parseDouble(atharv[2]); 
        hin=Double.parseDouble(atharv[3]); 
        bio=Double.parseDouble(atharv[4]); 
        chem=Double.parseDouble(atharv[5]); 
        phy=Double.parseDouble(atharv[6]); 
        hici=Double.parseDouble(atharv[7]); 
        geo=Double.parseDouble(atharv[8]); 
        comp=Double.parseDouble(atharv[9]); name=(atharv[10]); System.out.println(name);
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