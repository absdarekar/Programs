package ScienceAndTechnology;
import java.io.*;
class PERIODICTABLE
{
    public static void main (String atharv[])throws IOException
    {
        BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.println("WELCOME TO THE MODERMN PERIODIC TABLE PROGRAMMED BY ATHARV DAREKAR");
        System.out.println("TYPE 119 FOR EXIT");
        do
        {
            System.out.println("TYPE ATOMIC NUMBER OF ANY VALID ELEMENT FOR THE INFORMATION");
            a=Integer.parseInt(A.readLine());
            switch (a)
            {
                case 1:
                System.out.println("ELEMENT-HYDROGEN (H)");
                System.out.println("MASS NUMBER=1.008");
                System.out.println("PERIOD AND GROUP=1,1");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF- NON-METAL");
                System.out.println("VALENCY=+1");
                System.out.println("");
                break;
                case 2:
                System.out.println("ELEMENT-HELIUM (He)");
                System.out.println("MASS NUMBER=4.003");
                System.out.println("PERIOD AND GROUP=1,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBLE ELEMENT");
                System.out.println("PROPERTIES OF-INERT ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 3:
                System.out.println("ELEMENT-LITHIUM (Li)");
                System.out.println("MASS NUMBER=6.941");
                System.out.println("PERIOD AND GROUP=2,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF- METALS");
                System.out.println("VALENCY=+1");
                System.out.println("");
                break;
                case 4:
                System.out.println("ELEMENT-BERYLLIUM (Be)");
                System.out.println("MASS NUMBER=9.012182");
                System.out.println("PERIOD AND GROUP=2,13");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-METALS");
                System.out.println("PROPERTIES OF-ALKALINE EARTH METAL ");
                System.out.println("VALENCY=+2");
                System.out.println("");
                break;
                case 5:
                System.out.println("ELEMENT-BORON (B)");
                System.out.println("MASS NUMBER=10.811");
                System.out.println("PERIOD AND GROUP=2,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF- METAL");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 6:
                System.out.println("ELEMENT-CARBON (C)");
                System.out.println("MASS NUMBER=12.0107");
                System.out.println("PERIOD AND GROUP=2,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENTS");
                System.out.println("PROPERTIES OF-NON-METAL ");
                System.out.println("VALENCY=-4,4");
                System.out.println("");
                break;
                case 7:
                System.out.println("ELEMENT-NITROGEN (N)");
                System.out.println("MASS NUMBER=14.67");
                System.out.println("PERIOD AND GROUP=2,15");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NORMAL ELEMENTS");
                System.out.println("PROPERTIES OF-NON-METAS ");
                System.out.println("VALENCY=-3");
                System.out.println("");
                break;
                case 8:
                System.out.println("ELEMENT-OXYGEN (O)");
                System.out.println("MASS NUMBER=15.9994");
                System.out.println("PERIOD AND GROUP=2,16");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NORMAL ELEMENTS");
                System.out.println("PROPERTIES OF-NON-METALS ");
                System.out.println("VALENCY=-2");
                System.out.println("");
                break;
                case 9:
                System.out.println("ELEMENT-FLUROINE (F)");
                System.out.println("MASS NUMBER=18.998403");
                System.out.println("PERIOD AND GROUP=2,17");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NORMAL ELEMENTS");
                System.out.println("PROPERTIES OF-NON-METAL ");
                System.out.println("VALENCY=-1");
                System.out.println("");
                break;
                case 10:
                System.out.println("ELEMENT-NEON (Ne)");
                System.out.println("MASS NUMBER=20.1797");
                System.out.println("PERIOD AND GROUP=2,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBEL ELEMENT");
                System.out.println("PROPERTIES OF-INERT");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 11:
                System.out.println("ELEMENT-SODIUM (Na)");
                System.out.println("MASS NUMBER=22.989769");
                System.out.println("PERIOD AND GROUP=3,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF-METALS ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 12:
                System.out.println("ELEMENT-MAGNESIUM (Mg)");
                System.out.println("MASS NUMBER=24.3050");
                System.out.println("PERIOD AND GROUP=3,2");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE EARTH METAL ");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 13:
                System.out.println("ELEMENT-ALUMINIUM (Al)");
                System.out.println("MASS NUMBER= 26.981539");
                System.out.println("PERIOD AND GROUP=3,13");
                System.out.println("STATE AT ROOM TEMPRETURE-");
                System.out.println("CLASSIFICATION-NORMAL-ELEMENTS");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 14:
                System.out.println("ELEMENT-SILICON (Si)");
                System.out.println("MASS NUMBER=28.0855");
                System.out.println("PERIOD AND GROUP=3,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METALLOID ");
                System.out.println("VALENCY=-4");
                System.out.println("");
                break;
                case 15:
                System.out.println("ELEMENT-PHOSPHOROUS (P)");
                System.out.println("MASS NUMBER=30.973762");
                System.out.println("PERIOD AND GROUP=3,15");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL");
                System.out.println("VALENCY=-3");
                System.out.println("");
                break;
                case 16:
                System.out.println("ELEMENT-SULPHUR (S)");
                System.out.println("MASS NUMBER=32.65");
                System.out.println("PERIOD AND GROUP=3,16");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL ");
                System.out.println("VALENCY=-2");
                System.out.println("");
                break;
                case 17:
                System.out.println("ELEMENT-CHLORINE (Cl)");
                System.out.println("MASS NUMBER=35.453");
                System.out.println("PERIOD AND GROUP=3,17");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF- NON METAL");
                System.out.println("VALENCY=-1");
                System.out.println("");
                break;
                case 18:
                System.out.println("ELEMENT-ARGON (Ar)");
                System.out.println("MASS NUMBER=39.948");
                System.out.println("PERIOD AND GROUP=3,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBLE ELEMENT");
                System.out.println("PROPERTIES OF-INERT ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 19:
                System.out.println("ELEMENT-POTASSIUM (K)");
                System.out.println("MASS NUMBER=39.0983");
                System.out.println("PERIOD AND GROUP=4,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 20:
                System.out.println("ELEMENT-CALCIUM (Ca)");
                System.out.println("MASS NUMBER=40.078");
                System.out.println("PERIOD AND GROUP=4,2");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE EARTH METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 21:
                System.out.println("ELEMENT-SCANDIUM (Sc)");
                System.out.println("MASS NUMBER=44.95592");
                System.out.println("PERIOD AND GROUP=4,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSITION METALS");
                System.out.println("PROPERTIES OF-METALS");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 22:
                System.out.println("ELEMENT-TITANIUM (Ti)");
                System.out.println("MASS NUMBER=47.867");
                System.out.println("PERIOD AND GROUP=4,4");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSITION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 23:
                System.out.println("ELEMENT-VANADIUM (V)");
                System.out.println("MASS NUMBER=50.9415");
                System.out.println("PERIOD AND GROUP=4,5");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSITION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=5");
                System.out.println("");
                break;
                case 24:
                System.out.println("ELEMENT-CHROMIUM (Cr)");
                System.out.println("MASS NUMBER=51.9961");
                System.out.println("PERIOD AND GROUP=4,6");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSION ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=6,3");
                System.out.println("");
                break;
                case 25:
                System.out.println("ELEMENT-MANGANESE (Mn)");
                System.out.println("MASS NUMBER=54.938045");
                System.out.println("PERIOD AND GROUP=4,7");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSITION ELEMENT");
                System.out.println("PROPERTIES OF- METAL");
                System.out.println("VALENCY=7,4,2");
                System.out.println("");
                break;
                case 26:
                System.out.println("ELEMENT-IRON (Fe)");
                System.out.println("MASS NUMBER=55.845");
                System.out.println("PERIOD AND GROUP=4,8");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2,3");
                System.out.println("");
                break;
                case 27:
                System.out.println("ELEMENT-COBALT (Co)");
                System.out.println("MASS NUMBER=58.933195");
                System.out.println("PERIOD AND GROUP=4,9");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRASITION METAL");
                System.out.println("PROPERTIES OF- METAL");
                System.out.println("VALENCY=2,3");
                System.out.println("");
                break;
                case 28:
                System.out.println("ELEMENT-NICKEL (Ni)");
                System.out.println("MASS NUMBER=58.6934");
                System.out.println("PERIOD AND GROUP=4,10");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 29:
                System.out.println("ELEMENT-COPPER (Cu)");
                System.out.println("MASS NUMBER=63.546");
                System.out.println("PERIOD AND GROUP=4,11");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1,2");
                System.out.println("");
                break;
                case 30:
                System.out.println("ELEMENT-ZINC (Zn)");
                System.out.println("MASS NUMBER=65.38");
                System.out.println("PERIOD AND GROUP=4,12");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 31:
                System.out.println("ELEMENT-GALLIUM (Ga)");
                System.out.println("MASS NUMBER=69.723");
                System.out.println("PERIOD AND GROUP=4,13");
                System.out.println("STATE AT ROOM TEMPRETURE-LIQUID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 32:
                System.out.println("ELEMENT-GERMANIUM (Ge)");
                System.out.println("MASS NUMBER=72.64");
                System.out.println("PERIOD AND GROUP=4,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METALOID ");
                System.out.println("VALENCY=-4");
                System.out.println("");
                break;
                case 33:
                System.out.println("ELEMENT-ARSENIC (As)");
                System.out.println("MASS NUMBER=74.9216");
                System.out.println("PERIOD AND GROUP=4,15");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METALOID ");
                System.out.println("VALENCY=-3");
                System.out.println("");
                break;
                case 34:
                System.out.println("ELEMENT-SELENIUM (Se)");
                System.out.println("MASS NUMBER=78.96");
                System.out.println("PERIOD AND GROUP=4,16");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL ");
                System.out.println("VALENCY=-2");
                System.out.println("");
                break;
                case 35:
                System.out.println("ELEMENT-BROMINE (Br)");
                System.out.println("MASS NUMBER=79.904");
                System.out.println("PERIOD AND GROUP=4,17");
                System.out.println("STATE AT ROOM TEMPRETURE-LIQUID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL ");
                System.out.println("VALENCY=5,3,1");
                System.out.println("");
                break;
                case 36:
                System.out.println("ELEMENT-KRYPTON (Kr)");
                System.out.println("MASS NUMBER=83.798");
                System.out.println("PERIOD AND GROUP=4,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBLE ELEMENT");
                System.out.println("PROPERTIES OF-INERT ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 37:
                System.out.println("ELEMENT-RUBIDIUM (Rb)");
                System.out.println("MASS NUMBER=85.4678");
                System.out.println("PERIOD AND GROUP=5,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALI METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 38:
                System.out.println("ELEMENT-STRONTIUM (Sr)");
                System.out.println("MASS NUMBER=87.62");
                System.out.println("PERIOD AND GROUP=5,2");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALI EARTH METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 39:
                System.out.println("ELEMENT-YTTRIUM (Y)");
                System.out.println("MASS NUMBER=88.90585");
                System.out.println("PERIOD AND GROUP=5,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 40:
                System.out.println("ELEMENT-ZIRCONIUM (Zr)");
                System.out.println("MASS NUMBER=91.224");
                System.out.println("PERIOD AND GROUP=5,4");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRASNSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 41:
                System.out.println("ELEMENT-NIOBIUM (Nb)");
                System.out.println("MASS NUMBER=92.90638");
                System.out.println("PERIOD AND GROUP=5,5");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=5");
                System.out.println("");
                break;
                case 42:
                System.out.println("ELEMENT-MOLYBDENUM (Mo)");
                System.out.println("MASS NUMBER=95.96");
                System.out.println("PERIOD AND GROUP=5,6");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF- METAL");
                System.out.println("VALENCY=6,4");
                System.out.println("");
                break;
                case 43:
                System.out.println("ELEMENT-TECHNETIUM (Tc)");
                System.out.println("MASS NUMBER=98.9062");
                System.out.println("PERIOD AND GROUP=5,7");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRAMNSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=7,4");
                System.out.println("");
                break;
                case 44:
                System.out.println("ELEMENT-RUTHENIUM (Ru)");
                System.out.println("MASS NUMBER=101.7");
                System.out.println("PERIOD AND GROUP=5,8");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,3");
                System.out.println("");
                break;
                case 45:
                System.out.println("ELEMENT-RHODIUM (Rh)");
                System.out.println("MASS NUMBER=102.9055");
                System.out.println("PERIOD AND GROUP=5,9");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 46:
                System.out.println("ELEMENT- PALLADIUM (Pd)");
                System.out.println("MASS NUMBER=106.42");
                System.out.println("PERIOD AND GROUP=5,10");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,2");
                System.out.println("");
                break;
                case 47:
                System.out.println("ELEMENT-SILVER (Ag)");
                System.out.println("MASS NUMBER=107.8682");
                System.out.println("PERIOD AND GROUP=5,11");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 48:
                System.out.println("ELEMENT-CADMIUM (Cd)");
                System.out.println("MASS NUMBER=112.411");
                System.out.println("PERIOD AND GROUP=5,12");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 49:
                System.out.println("ELEMENT-INDIUM (In)");
                System.out.println("MASS NUMBER=114.818");
                System.out.println("PERIOD AND GROUP=5,13");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 50:
                System.out.println("ELEMENT-TIN (Sn)");
                System.out.println("MASS NUMBER=118.710");
                System.out.println("PERIOD AND GROUP=5,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=-4");
                System.out.println("");
                break;
                case 51:
                System.out.println("ELEMENT-ANTIMONY (Sb)");
                System.out.println("MASS NUMBER=121.76");
                System.out.println("PERIOD AND GROUP=5,15");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METALLOID ");
                System.out.println("VALENCY=-3");
                System.out.println("");
                break;
                case 52:
                System.out.println("ELEMENT-TALLURIAM (Te) ");
                System.out.println("MASS NUMBER=127.6");
                System.out.println("PERIOD AND GROUP=5,16");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METALLOID ");
                System.out.println("VALENCY=-2");
                System.out.println("");
                break;
                case 53:
                System.out.println("ELEMENT-IODINE (I)");
                System.out.println("MASS NUMBER=126.90447");
                System.out.println("PERIOD AND GROUP=5,17");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 54:
                System.out.println("ELEMENT-XENON (Xe)");
                System.out.println("MASS NUMBER=131.293");
                System.out.println("PERIOD AND GROUP=5,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBLE ELEMENT");
                System.out.println("PROPERTIES OF-INERT ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 55:
                System.out.println("ELEMENT-CAESIUM (Cs)");
                System.out.println("MASS NUMBER=132.90545");
                System.out.println("PERIOD AND GROUP=6,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 56:
                System.out.println("ELEMENT-BARIUM (Ba)");
                System.out.println("MASS NUMBER=137.327");
                System.out.println("PERIOD AND GROUP=6,2");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE EARTH METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2");
                System.out.println("");
                break;
                case 57:
                System.out.println("ELEMENT-LANTHANUM (La)");
                System.out.println("MASS NUMBER=138.94788");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 58:
                System.out.println("ELEMENT-CERIUM (Ce)");
                System.out.println("MASS NUMBER=140.116");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,3");
                System.out.println("");
                break;
                case 59:
                System.out.println("ELEMENT-PRASEODYMIUM (Pr)");
                System.out.println("MASS NUMBER=140.90765");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 60:
                System.out.println("ELEMENT-NEODYMIUM (Nd)");
                System.out.println("MASS NUMBER=144.242");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 61:
                System.out.println("ELEMENT-PROMETHIUM (Pm)");
                System.out.println("MASS NUMBER=144.9127");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 62:
                System.out.println("ELEMENT-SAMARIUM (Sm)");
                System.out.println("MASS NUMBER=150.36");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 63:
                System.out.println("ELEMENT-EUROPIUM (Eu)");
                System.out.println("MASS NUMBER=151.964");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 64:
                System.out.println("ELEMENT-GADOLINIUM (Gd)");
                System.out.println("MASS NUMBER=157.25");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 65:
                System.out.println("ELEMENT-TERBIUM (Tb)");
                System.out.println("MASS NUMBER=158.92535");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 66:
                System.out.println("ELEMENT-DYSPROSIUM (Dy)");
                System.out.println("MASS NUMBER=");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 67:
                System.out.println("ELEMENT-HOLMIUM (Ho)");
                System.out.println("MASS NUMBER=164.93032");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 68:
                System.out.println("ELEMENT-ERBIUM (Er)");
                System.out.println("MASS NUMBER=167.259");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 69:
                System.out.println("ELEMENT-THULIUM (Tm)");
                System.out.println("MASS NUMBER=168.93421");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 70:
                System.out.println("ELEMENT-YTTERBIUM (Yb)");
                System.out.println("MASS NUMBER=173.054");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 71:
                System.out.println("ELEMENT-LUTETIUM (Lu)");
                System.out.println("MASS NUMBER=174.9668");
                System.out.println("PERIOD AND GROUP=6,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-IINER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 72:
                System.out.println("ELEMENT-HAFNIUM (Hf)");
                System.out.println("MASS NUMBER=178.48");
                System.out.println("PERIOD AND GROUP=6,4");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 73:
                System.out.println("ELEMENT-TANTALUM (Ta)");
                System.out.println("MASS NUMBER=180.9479");
                System.out.println("PERIOD AND GROUP=6,5");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=5");
                System.out.println("");
                break;
                case 74:
                System.out.println("ELEMENT-TUNGSTEN (W)");
                System.out.println("MASS NUMBER=183.84");
                System.out.println("PERIOD AND GROUP=6,6");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,6");
                System.out.println("");
                break;
                case 75:
                System.out.println("ELEMENT-RHENIUM (Re)");
                System.out.println("MASS NUMBER=186.207");
                System.out.println("PERIOD AND GROUP=6,7");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 76:
                System.out.println("ELEMENT-OSMIUM (Os)");
                System.out.println("MASS NUMBER=190.23");
                System.out.println("PERIOD AND GROUP=6,8");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 77:
                System.out.println("ELEMENT-IRADIUM (Ir)");
                System.out.println("MASS NUMBER=192.217");
                System.out.println("PERIOD AND GROUP=6,9");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,3");
                System.out.println("");
                break;
                case 78:
                System.out.println("ELEMENT-PLATINUM (Pt)");
                System.out.println("MASS NUMBER=195.084");
                System.out.println("PERIOD AND GROUP=6,10");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,2");
                System.out.println("");
                break;
                case 79:
                System.out.println("ELEMENT-GOLD (Au)");
                System.out.println("MASS NUMBER=196.96657");
                System.out.println("PERIOD AND GROUP=6,11");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 80:
                System.out.println("ELEMENT-MERCURY (Hg)");
                System.out.println("MASS NUMBER=200.59");
                System.out.println("PERIOD AND GROUP=6,12");
                System.out.println("STATE AT ROOM TEMPRETURE-LIQUID");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=2,1");
                System.out.println("");
                break;
                case 81:
                System.out.println("ELEMENT-THALIUM (Tl)");
                System.out.println("MASS NUMBER=204.3833");
                System.out.println("PERIOD AND GROUP=6,13");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3,1");
                System.out.println("");
                break;
                case 82:
                System.out.println("ELEMENT-LEAD (Pb)");
                System.out.println("MASS NUMBER=207.2");
                System.out.println("PERIOD AND GROUP=6,14");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,2");
                System.out.println("");
                break;
                case 83:
                System.out.println("ELEMENT-BISMUTH (Bi)");
                System.out.println("MASS NUMBER= 208.98040");
                System.out.println("PERIOD AND GROUP=6,15");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 84:
                System.out.println("ELEMENT-POLONIUM (Po)");
                System.out.println("MASS NUMBER=208.9824");
                System.out.println("PERIOD AND GROUP=6,16");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4,2");
                System.out.println("");
                break;
                case 85:
                System.out.println("ELEMENT-ASTATINE (At)");
                System.out.println("MASS NUMBER=209.9871");
                System.out.println("PERIOD AND GROUP=6,17");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-NON METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 86:
                System.out.println("ELEMENT-RADON (Rn)");
                System.out.println("MASS NUMBER=222.0176");
                System.out.println("PERIOD AND GROUP=6,18");
                System.out.println("STATE AT ROOM TEMPRETURE-GAS");
                System.out.println("CLASSIFICATION-NOBEL ELEMENT");
                System.out.println("PROPERTIES OF-INERT ");
                System.out.println("VALENCY=0");
                System.out.println("");
                break;
                case 87:
                System.out.println("ELEMENT-FRANCIUM (Fr)");
                System.out.println("MASS NUMBER=223.0197");
                System.out.println("PERIOD AND GROUP=7,1");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=1");
                System.out.println("");
                break;
                case 88:
                System.out.println("ELEMENT-RADIUM (Ra)");
                System.out.println("MASS NUMBER=226.0254");
                System.out.println("PERIOD AND GROUP=7,2");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-ALKALINE EARTH METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 89:
                System.out.println("ELEMENT-ACTINIUM (Ac)");
                System.out.println("MASS NUMBER=227.0278");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                case 90:
                System.out.println("ELEMENT-THORIUM (Th)");
                System.out.println("MASS NUMBER=232.381");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 91:
                System.out.println("ELEMENT-PROTACTIUM (Pa) ");
                System.out.println("MASS NUMBER=231.3588");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=5");
                System.out.println("");
                break;
                case 92:
                System.out.println("ELEMENT-URANIUM (U)");
                System.out.println("MASS NUMBER=238.2898");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=6");
                System.out.println("");
                break;
                case 93:
                System.out.println("ELEMENT-NEPTUNIUM (Np)");
                System.out.println("MASS NUMBER=237.482");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=5");
                System.out.println("");
                break;
                case 94:
                System.out.println("ELEMENT-PLUTONIUM (Pu)");
                System.out.println("MASS NUMBER=244.642");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=4");
                System.out.println("");
                break;
                case 95:
                System.out.println("ELEMENT-AMERICIUM (Am)");
                System.out.println("MASS NUMBER=243.614");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 96:
                System.out.println("ELEMENT-CURIUM (Cm)");
                System.out.println("MASS NUMBER=247");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 97:
                System.out.println("ELEMENT-BERKELIUM (Bk)");
                System.out.println("MASS NUMBER=247.703");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 98:
                System.out.println("ELEMENT-CALIFORNIUM (Cf)");
                System.out.println("MASS NUMBER=251.796");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 99:
                System.out.println("ELEMENT-EINSTEINIUM (Es)");
                System.out.println("MASS NUMBER=252.03");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 100:
                System.out.println("ELEMENT-FERMIUM (Fm)");
                System.out.println("MASS NUMBER=257.951");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 101:
                System.out.println("ELEMENT-MENDELEVIUM (Md)");
                System.out.println("MASS NUMBER=258.1");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 102:
                System.out.println("ELEMENT-NOBLIUM (No)");
                System.out.println("MASS NUMBER=259.1009");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 103:
                System.out.println("ELEMENT-LAWRENCIUM");
                System.out.println("MASS NUMBER=260.1053");
                System.out.println("PERIOD AND GROUP=7,3");
                System.out.println("STATE AT ROOM TEMPRETURE-SOLID");
                System.out.println("CLASSIFICATION-INNER TRANSMISSION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("VALENCY=3");
                System.out.println("");
                break;
                case 104:
                System.out.println("ELEMENT-RUTHERFORDIUM (Rf)");
                System.out.println("MASS NUMBER=261.11");
                System.out.println("PERIOD AND GROUP=7,4");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 105:
                System.out.println("ELEMENT-DUBNIUM (Db)");
                System.out.println("MASS NUMBER=262.11");
                System.out.println("PERIOD AND GROUP=7,5");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 106:
                System.out.println("ELEMENT-SEABORGIUM (Sg)");
                System.out.println("MASS NUMBER=263.12");
                System.out.println("PERIOD AND GROUP=7,6");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 107:
                System.out.println("ELEMENT-BOHRIUM (Bh)");
                System.out.println("MASS NUMBER=262.12");
                System.out.println("PERIOD AND GROUP=7,7");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 108:
                System.out.println("ELEMENT-HASSIUM");
                System.out.println("MASS NUMBER=264");
                System.out.println("PERIOD AND GROUP=7,8");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 109:
                System.out.println("ELEMENT-MEITNERIUM");
                System.out.println("MASS NUMBER=266.1378");
                System.out.println("PERIOD AND GROUP=7,9");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 110:
                System.out.println("ELEMENT-DAMSTACIUM (Ds)");
                System.out.println("MASS NUMBER=269");
                System.out.println("PERIOD AND GROUP=7,10");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 111:
                System.out.println("ELEMENT-ROENTGENTIUM (Rg)");
                System.out.println("MASS NUMBER=272");
                System.out.println("PERIOD AND GROUP=7,11");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 112:
                System.out.println("ELEMENT-COPERNICIUM (Cp)");
                System.out.println("MASS NUMBER=277");
                System.out.println("PERIOD AND GROUP=7,12");
                System.out.println("CLASSIFICATION-TRANSISION METAL");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 113:
                System.out.println("ELEMENT-UNUNTRIUM (Uut)");
                System.out.println("MASS NUMBER=284");
                System.out.println("PERIOD AND GROUP=7,13");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 114:
                System.out.println("ELEMENT-UNUNQUADIUM (Uuq)");
                System.out.println("MASS NUMBER=289");
                System.out.println("PERIOD AND GROUP=7,14");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 115:
                System.out.println("ELEMENT-UNUNPENTIUM (Uup)");
                System.out.println("MASS NUMBER=288");
                System.out.println("PERIOD AND GROUP=7,15");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 116:
                System.out.println("ELEMENT-UNUNHEXIUM (Uuh)");
                System.out.println("MASS NUMBER=292");
                System.out.println("PERIOD AND GROUP=7,16");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 117:
                System.out.println("ELEMENT-UNUNSEPTIUM");
                System.out.println("MASS NUMBER=293");
                System.out.println("PERIOD AND GROUP=7,17");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 118:
                System.out.println("ELEMENT-UNUNOCTIUM");
                System.out.println("MASS NUMBER=294");
                System.out.println("PERIOD AND GROUP=7,18");
                System.out.println("CLASSIFICATION-NORMAL ELEMENT");
                System.out.println("PROPERTIES OF-METAL ");
                System.out.println("");
                break;
                case 119:
                System.out.println("THANK YOU!!");
                break;
                default:
                System.out.println("ERROR INVALID OPTION PLEASE TRY AGAIN");
            }
        }while(a!=119);
    }
}