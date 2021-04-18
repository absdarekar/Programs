package InputMethods;
public class MARKS_ASSINGNMENT
{
    public static void main(String atharv[])
    {
        String name;
        name="Name: Atharv B. Darekar";
        System.out.println(name);
        double math=37,phy=37,comp=44,chem=38,bio=33,geo=37,hici=36,eng1=30,eng2=34,hin=35,avg,total;
        double per;
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