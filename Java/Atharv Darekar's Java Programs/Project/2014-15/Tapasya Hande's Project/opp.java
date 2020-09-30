import java.util.*;
class opp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        int n;

        System.out.println("****************************************************************");
        System.out.println("                            WELCOME TO                          ");
        System.out.println("                       DEL AMO SHOPPING MALL                    ");
        System.out.println("****************************************************************");
        System.out.println("                                                                                                           ");

        System.out.println("      !!!!!!!!WHAT ARE  YOU LOOKING FORWARD FOR !!!!!!!!        ");
        System.out.println("                                                                                                           ");
        System.out.println("1 => GAME ZONE \n");

        System.out.println("2 =>SNACKS CENTRE\n");

        System.out.println("3 =>ELECTRONICS\n");

        System.out.println("4 =>MEN'S SHOPPING\n");

        System.out.println("5 =>WOMEN'S SHOOPING\n");

        System.out.println("Enter your choice : \n");

        n =input.nextInt();

        if (n==1) {

            System.out.println("!!!!^^^^^Welcome to Game zone^^^^^!!!!");
            int a;

            System.out.println("1 => PIN BALL\n");
            System.out.println("2 => CASIO \n");
            System.out.println("3 => POOL GAME\n");
            System.out.println("-----------Enter the Choice :--------------\n");
            a=input1.nextInt();

            if(a==1)
            { 
                System.out.println("Played Time => 1 Hour\n");
                System.out.println("Total cost = 800 RS\n");
                System.out.println("-------------HAVE A GOOD TIME--------------------");
            }
            else if(a==2)
            {     
                System.out.println("Played Time => 1 Hour\n");
                System.out.println("Total cost = 750 RS\n"); 
                System.out.println("-------------HAVE A GOOD TIME--------------------");
            }
            else if(a==3)
            {
                System.out.println("Played Time => 1 Hour\n");
                System.out.println("Total cost = 600 RS\n"); 
                System.out.println("-------------HAVE A GOOD TIME--------------------");
            }
            else
            {
                System.out.println("WRONG CHOICE");
            }
        }   

        else if (n==2) 
        {

            System.out.println("!!!!^^^^^WELCOME TO SN@CK CENTRE^^^^^!!!!");
            int b;
            System.out.println("1 =>SN@CKS\n");
            System.out.println("2 => BEVER@GES\n");
            System.out.println("--------------------Enter the Choice :-----------------\n");

            b=input1.nextInt();

            if(b==1)
            {
                System.out.println("1.PIZZ@ 2.S@NDWICH 3.BURGER\n");
                System.out.println("-----------ENTER YOUR CHOICE------------\n");
                int c;
                c = input1.nextInt();
                if(c==1)
                {
                    int qua=0;
                    System.out.println("Enter the quantity:");
                    qua=input1.nextInt();
                    System.out.println("Total Quantity :"+qua);
                    System.out.println("Total cost - Rs. 100\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(c==2)
                {
                    int qua1=0;
                    System.out.println("Enter the quantity:");
                    qua1=input1.nextInt();
                    System.out.println("Total Quantity :"+qua1);
                    System.out.println("Total cost => Rs. 60\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(c==3)
                {
                    int qua2=0;
                    System.out.println("Enter the quantity:");
                    qua2=input1.nextInt();
                    System.out.println("Total Quantity :"+qua2);
                    System.out.println("Burger each piece cost => 75 RS\n"); 
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
            else
            {        
                System.out.println("1.HOT COFFEE 2.COLD COFFEE 3.TE@ \n");
                System.out.println("-----------ENTER YOUR CHOICE------------\n");
                int d;
                d = input1.nextInt();
                if(d==1)
                {
                    int qu=0;
                    System.out.println("Enter the quantity:");
                    qu=input1.nextInt();
                    System.out.println("Total Quantity :"+qu);
                    System.out.println("Hot coffee costs => 55 RS\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(d==2)
                {
                    int  qu1=0;
                    System.out.println("Enter the quantity:");
                    qu1=input1.nextInt();
                    System.out.println("Total Quantity :"+qu1);
                    System.out.println("Cold coffee each piece cost => 70 RS\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(d==3)
                {
                    int  qu2=0;
                    System.out.println("Enter the quantity:");
                    qu2=input1.nextInt();
                    System.out.println("Total Quantity :"+qu2);
                    System.out.println("Tea each piece cost => 45 RS\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
        }
        else if (n==3)
        {
            System.out.println("---------------Welcome to Electronics------------------");

            int e;
            System.out.println("1 =>LED TV\n");
            System.out.println("2 => PLASMA TV\n");  
            System.out.println("3 =>SMART TV\n");
            System.out.println("4 => CURVED TV\n");  
            System.out.println("Enter the your choice\n");

            e=input1.nextInt();

            if(e==1)
            {
                System.out.println("1.H5100 -42' 2.H4100 -32'\n");
                System.out.println("-----------CHOOSE YOUR MODEL NUMBER------------\n");
                int c;
                c = input1.nextInt();
                if(c==1)
                {
                    System.out.println("H5100 -42' cost => 77,900 RS.\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(c==2)
                {
                    System.out.println("H4100 -32' cost => 44,650 RS.\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
            else if(e==2)
            {
                System.out.println("1.F5100 -42' 2.F4100 -32'\n");
                System.out.println("-----------CHOOSE YOUR MODEL NUMBER------------\n");
                int c;
                c = input1.nextInt();
                if(c==1)
                {
                    System.out.println("F5500 -51' cost => 78,900 RS.\n");
                }
                else if(c==2)
                {
                    System.out.println("F4100 -32' cost => 44,650 RS.\n"); 
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
            else if(e==3)
            {
                System.out.println("1.H5500 -48' 2.H4500 -32'\n");
                System.out.println("-----------CHOOSE YOUR MODEL NUMBER------------\n");
                int c;
                c = input1.nextInt();
                if(c==1)
                {
                    System.out.println("H5500 -48' cost => 90,500 RS.\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(c==2)
                {
                    System.out.println("H4500 -32' cost => 45,500 RS.\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
            else 
            {
                System.out.println("1.H8000 -62' 2.HU9000 -78'\n");
                System.out.println("-----------CHOICE YOUR MODEL NUMBER------------\n");
                int c;
                c = input1.nextInt();
                if(c==1)
                {
                    System.out.println("H8000 -62' cost => 1,62,900 RS.\n");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else if(c==2)
                {
                    System.out.println("HU9000 -78' cost => 2,43,800 RS.\n"); 
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                }
                else 
                {
                    System.out.println("wrong choice");
                }
            }
        }
        else if (n==4)
        {
            System.out.println("---------------Welcome to boys clothing------------------");

            int k ;
            System.out.println("1 => Jeans\n");
            System.out.println("2 => Trousers\n");  
            System.out.println("3 => Shirt\n");
            System.out.println("4 => T-Shirts\n");  
            System.out.println("Enter the your choice\n");

            k=input1.nextInt();

            if(k==1)
            {
                System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                System.out.println("-----------CHOICE YOUR BRAND------------\n");
                int cu;
                cu = input1.nextInt();
                if(cu==1)
                {
                    int s;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BLACK\n");
                    System.out.println("2 => DARK BLUE\n");  
                    System.out.println("3 =>  OFF WHITE \n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int t;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int quant=0;
                    System.out.println("Enter the quantity:");
                    quant=input1.nextInt();
                    System.out.println("Total Quantity :"+quant);

                    int hu;
                    hu=quant*1200;
                    System.out.println("Total cost:"+hu);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(cu==2)
                {
                    int s;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BROWN\n");
                    System.out.println("2 => SKY BLUE\n");  
                    System.out.println("3 =>  WHITE \n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int t;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qnty=0;
                    System.out.println("Enter the quantity:");
                    qnty=input1.nextInt();
                    System.out.println("Total Quantity :"+qnty);
                    int hy ;
                    hy=qnty*1340;
                    System.out.println("Total cost: "+hy);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                } 
                else if(cu==3)
                {
                    int s;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 =>VIOLET\n");
                    System.out.println("2 => RED\n");  
                    System.out.println("3 => PINK\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int t;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qnty=0;
                    System.out.println("Enter the quantity:");
                    qnty=input1.nextInt();
                    System.out.println("Total Quantity :"+qnty);
                    int hi;
                    hi=qnty*1500;
                    System.out.println("Total cost: "+hi);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(cu==4)
                {
                    int s;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => YELLOW\n");
                    System.out.println("2 => GREEN\n");  
                    System.out.println("3 =>  GREY\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int t;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>30\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    s=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qnty=0;
                    System.out.println("Enter the quantity:");
                    qnty=input1.nextInt();
                    System.out.println("Total Quantity :"+qnty);
                    int ho;
                    ho=qnty*1170;
                    System.out.println("Total cost: "+ho);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");
                }
                else {
                    System.out.println("Wrong choice:");
                }
            }

            else  if(k==2)
            {
                System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                System.out.println("-----------CHOICE YOUR BRAND------------\n");
                int u;
                u = input1.nextInt();
                if(u==1)
                {
                    int i;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BLACK\n");
                    System.out.println("2 => DARK BLUE\n");  
                    System.out.println("3 =>  OFF WHITE \n");
                    i=input1.nextInt();

                    int j;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    j=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qt=0;
                    System.out.println("Enter the quantity:");
                    qt=input1.nextInt();
                    System.out.println("__________________________________________");
                    System.out.println("Total Quantity :"+qt);
                    int nl;
                    nl=qt*1600;
                    System.out.println("Total cost:"+nl);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(u==2)
                {
                    int i;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BROWN\n");
                    System.out.println("2 => SKY BLUE\n");  
                    System.out.println("3 =>  WHITE \n");
                    i=input1.nextInt();
                    System.out.println("__________________________________________");
                    int j;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    j=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qt=0;
                    System.out.println("Enter the quantity:");
                    qt=input1.nextInt();
                    System.out.println("Total Quantity :"+qt);
                    int nk;
                    nk=qt*1470;
                    System.out.println("Total cost:"+nk);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                } 
                else if(u==3)
                {
                    int i;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 =>VIOLET\n");
                    System.out.println("2 => RED\n");  
                    System.out.println("3 => PINK\n");
                    i=input1.nextInt();
                    System.out.println("__________________________________________");
                    int j;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    j=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qt=0;
                    System.out.println("Enter the quantity:");
                    qt=input1.nextInt();
                    System.out.println("Total Quantity :"+qt);
                    int nj;
                    nj=qt*1490;
                    System.out.println("Total cost:"+nj);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(u==4)
                {
                    int i;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => YELLOW\n");
                    System.out.println("2 => GREEN\n");  
                    System.out.println("3 =>  GREY\n");
                    i=input1.nextInt();
                    System.out.println("__________________________________________");
                    int j;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>30\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    j=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qt=0;
                    System.out.println("Enter the quantity:");
                    qt=input1.nextInt();
                    System.out.println("Total Quantity :"+qt);
                    System.out.println("__________________________________________");
                    int nh;
                    nh=qt*1510;
                    System.out.println("Total cost: Rs."+nh);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");
                }
                else {
                    System.out.println("wrong choice");
                }
            }

            else if(k==3)
            {
                System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                System.out.println("-----------CHOICE YOUR BRAND------------\n");
                int v;
                v = input1.nextInt();
                if(v==1)
                {
                    int l;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BLACK\n");
                    System.out.println("2 => DARK BLUE\n");  
                    System.out.println("3 =>  OFF WHITE \n");
                    l=input1.nextInt();
                    System.out.println("__________________________________________");
                    int p;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    p=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qun=0;
                    System.out.println("Enter the quantity:");
                    qun=input1.nextInt();
                    System.out.println("Total Quantity :"+qun);         
                    int bl;
                    bl=qun*750;
                    System.out.println("Total cost: Rs."+bl);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(v==2)
                {
                    int l;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BROWN\n");
                    System.out.println("2 => SKY BLUE\n");  
                    System.out.println("3 =>  WHITE \n");
                    l=input1.nextInt();
                    System.out.println("__________________________________________");
                    int p;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    p=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qun=0;
                    System.out.println("Enter the quantity:");
                    qun=input1.nextInt();
                    System.out.println("Total Quantity :"+qun);
                    int bk;
                    bk=qun*899;
                    System.out.println("Total cost: Rs."+bk);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                } 
                else if(v==3)
                {
                    int l;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 =>VIOLET\n");
                    System.out.println("2 => RED\n");  
                    System.out.println("3 => PINK\n");
                    l=input1.nextInt();
                    System.out.println("__________________________________________");
                    int p;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    p=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qun=0;
                    System.out.println("Enter the quantity:");
                    qun=input1.nextInt();
                    System.out.println("Total Quantity :"+qun);
                    int bj;
                    bj=qun*650;
                    System.out.println("Total cost: Rs."+bj);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(v==4)
                {
                    int l;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => YELLOW\n");
                    System.out.println("2 => GREEN\n");  
                    System.out.println("3 =>  GREY\n");
                    l=input1.nextInt();
                    System.out.println("__________________________________________");
                    int p;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>30\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    p=input1.nextInt();
                    System.out.println("__________________________________________");
                    int qun=0;
                    System.out.println("Enter the quantity:");
                    qun=input1.nextInt();
                    System.out.println("Total Quantity :"+qun);
                    System.out.println("Total cost: Rs499/-");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");
                }
                else
                {
                    System.out.println("wrong choice");
                }
            }
            else 
            {
                System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                System.out.println("-----------CHOICE YOUR BRAND------------\n");
                int w;
                w = input1.nextInt();
                if(w==1)
                {
                    int h;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BLACK\n");
                    System.out.println("2 => DARK BLUE\n");  
                    System.out.println("3 =>  OFF WHITE \n");
                    h=input1.nextInt();
                    System.out.println("__________________________________________");
                    int g;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    g=input1.nextInt();
                    System.out.println("__________________________________________");
                    int quant=0;
                    System.out.println("Enter the quantity:");
                    quant=input1.nextInt();
                    System.out.println("Total Quantity :"+quant);
                    int vl=quant*360;
                    System.out.println("Total cost:Rs."+vl);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(w==2)
                {
                    int h;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => BROWN\n");
                    System.out.println("2 => SKY BLUE\n");  
                    System.out.println("3 =>  WHITE \n");
                    h=input1.nextInt();
                    System.out.println("__________________________________________");
                    int g;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 30\n");  
                    System.out.println("3 => 32\n");
                    g=input1.nextInt();
                    System.out.println("__________________________________________");
                    int quant1=0;
                    System.out.println("Enter the quantity:");
                    quant1=input1.nextInt();
                    System.out.println("Total Quantity :"+quant1);
                    int vk;
                    vk=quant1*450;
                    System.out.println("Total cost: Rs.");
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                } 
                else if(w==3)
                {
                    int h;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 =>VIOLET\n");
                    System.out.println("2 => RED\n");  
                    System.out.println("3 => PINK\n");
                    h=input1.nextInt();
                    System.out.println("__________________________________________");
                    int g;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>28\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    g=input1.nextInt();
                    System.out.println("__________________________________________");
                    int quant=0;
                    System.out.println("Enter the quantity:");
                    quant=input1.nextInt();
                    System.out.println("Total Quantity :"+quant);
                    int vj;
                    vj=quant*540;
                    System.out.println("Total cost: Rs."+vj);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");

                }
                else if(w==4)
                {
                    int h;
                    System.out.println("CHOOSE YOUR COLOUR :............\n");
                    System.out.println("1 => YELLOW\n");
                    System.out.println("2 => GREEN\n");  
                    System.out.println("3 =>  GREY\n");
                    h=input1.nextInt();
                    System.out.println("__________________________________________");
                    int g;
                    System.out.println("CHOOSE YOUR SIZE:....................\n");
                    System.out.println("1 =>30\n");
                    System.out.println("2 => 32\n");  
                    System.out.println("3 => 34\n");
                    g=input1.nextInt();
                    System.out.println("__________________________________________");
                    int quant=0;
                    System.out.println("Enter the quantity:");
                    quant=input1.nextInt();
                    System.out.println("Total Quantity :"+quant);
                    int vh;
                    vh=quant*540;
                    System.out.println("Total cost: Rs."+vh);
                    System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                    System.out.println("-------------HAVE A GOOD DAY--------------------");
                }}
            if(n==5) 
            {
                System.out.println("---------------Welcome to women's clothing------------------");

                int jt ;
                System.out.println("1 => Jeans\n");
                System.out.println("2 => Trousers\n");  
                System.out.println("3 => Shirt\n");
                System.out.println("4 => T-Shirts\n");  
                System.out.println("Enter the your choice\n");

                jt=input1.nextInt();

                if(jt==1)
                {
                    System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                    System.out.println("-----------CHOICE YOUR BRAND------------\n");
                    int cu;
                    cu = input1.nextInt();
                    if(cu==1)
                    {
                        int s;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BLACK\n");
                        System.out.println("2 => DARK BLUE\n");  
                        System.out.println("3 =>  OFF WHITE \n");
                        s=input1.nextInt();

                        int t;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        s=input1.nextInt();
                        int quant=0;
                        System.out.println("Enter the quantity:");
                        quant=input1.nextInt();
                        System.out.println("Total Quantity :"+quant);

                        System.out.println("Total cost: Rs.3600/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(cu==2)
                    {
                        int s;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BROWN\n");
                        System.out.println("2 => SKY BLUE\n");  
                        System.out.println("3 =>  WHITE \n");
                        s=input1.nextInt();

                        int t;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        s=input1.nextInt();
                        int qnty=0;
                        System.out.println("Enter the quantity:");
                        qnty=input1.nextInt();
                        System.out.println("Total Quantity :"+qnty);
                        System.out.println("Total cost: Rs.2800/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    } 
                    else if(cu==3)
                    {
                        int s;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 =>VIOLET\n");
                        System.out.println("2 => RED\n");  
                        System.out.println("3 => PINK\n");
                        s=input1.nextInt();

                        int t;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        s=input1.nextInt();
                        int qnty=0;
                        System.out.println("Enter the quantity:");
                        qnty=input1.nextInt();
                        System.out.println("Total Quantity :"+qnty);
                        System.out.println("Total cost: Rs.1860/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(cu==4)
                    {
                        int s;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => YELLOW\n");
                        System.out.println("2 => GREEN\n");  
                        System.out.println("3 =>  GREY\n");
                        s=input1.nextInt();

                        int t;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>30\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        s=input1.nextInt();
                        int qnty=0;
                        System.out.println("Enter the quantity:");
                        qnty=input1.nextInt();
                        System.out.println("Total Quantity :"+qnty);
                        System.out.println("Total cost: Rs.999/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");
                    }
                    else {
                        System.out.println("Wrong choice:");
                    }
                }

                else  if(jt==2)
                {
                    System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                    System.out.println("-----------CHOICE YOUR BRAND------------\n");
                    int u;
                    u = input1.nextInt();
                    if(u==1)
                    {
                        int i;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BLACK\n");
                        System.out.println("2 => DARK BLUE\n");  
                        System.out.println("3 =>  OFF WHITE \n");
                        i=input1.nextInt();

                        int j;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        j=input1.nextInt();
                        int qt=0;
                        System.out.println("Enter the quantity:");
                        qt=input1.nextInt();
                        System.out.println("Total Quantity :"+qt);

                        System.out.println("Total cost: Rs.2700/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(u==2)
                    {
                        int i;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BROWN\n");
                        System.out.println("2 => SKY BLUE\n");  
                        System.out.println("3 =>  WHITE \n");
                        i=input1.nextInt();

                        int j;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        j=input1.nextInt();
                        int qt=0;
                        System.out.println("Enter the quantity:");
                        qt=input1.nextInt();
                        System.out.println("Total Quantity :"+qt);

                        System.out.println("Total cost: Rs.1900/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    } 
                    else if(u==3)
                    {
                        int i;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 =>VIOLET\n");
                        System.out.println("2 => RED\n");  
                        System.out.println("3 => PINK\n");
                        i=input1.nextInt();

                        int j;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        j=input1.nextInt();
                        int qt=0;
                        System.out.println("Enter the quantity:");
                        qt=input1.nextInt();
                        System.out.println("Total Quantity :"+qt);    
                        System.out.println("Total cost: Rs.1360/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(u==4)
                    {
                        int i;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => YELLOW\n");
                        System.out.println("2 => GREEN\n");  
                        System.out.println("3 =>  GREY\n");
                        i=input1.nextInt();

                        int j;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>30\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        j=input1.nextInt();
                        int qt=0;
                        System.out.println("Enter the quantity:");
                        qt=input1.nextInt();
                        System.out.println("Total Quantity :"+qt);

                        System.out.println("Total cost: Rs.879/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");
                    }
                    else {
                        System.out.println("wrong choice");
                    }
                }

                else if(jt==3)
                {
                    System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                    System.out.println("-----------CHOICE YOUR BRAND------------\n");
                    int v;
                    v = input1.nextInt();
                    if(v==1)
                    {
                        int l;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BLACK\n");
                        System.out.println("2 => DARK BLUE\n");  
                        System.out.println("3 =>  OFF WHITE \n");
                        l=input1.nextInt();

                        int p;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        p=input1.nextInt();
                        int qun=0;
                        System.out.println("Enter the quantity:");
                        qun=input1.nextInt();
                        System.out.println("Total Quantity :"+qun);         

                        System.out.println("Total cost: Rs.675/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(v==2)
                    {
                        int l;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BROWN\n");
                        System.out.println("2 => SKY BLUE\n");  
                        System.out.println("3 =>  WHITE \n");
                        l=input1.nextInt();

                        int p;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        p=input1.nextInt();
                        int qun=0;
                        System.out.println("Enter the quantity:");
                        qun=input1.nextInt();
                        System.out.println("Total Quantity :"+qun);
                        System.out.println("Total cost: Rs.540/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    } 
                    else if(v==3)
                    {
                        int l;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 =>VIOLET\n");
                        System.out.println("2 => RED\n");  
                        System.out.println("3 => PINK\n");
                        l=input1.nextInt();

                        int p;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        p=input1.nextInt();
                        int qun=0;
                        System.out.println("Enter the quantity:");
                        qun=input1.nextInt();
                        System.out.println("Total Quantity :"+qun);    
                        System.out.println("Total cost: Rs.880/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(v==4)
                    {
                        int l;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => YELLOW\n");
                        System.out.println("2 => GREEN\n");  
                        System.out.println("3 =>  GREY\n");
                        l=input1.nextInt();

                        int p;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>30\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        p=input1.nextInt();
                        int qun=0;
                        System.out.println("Enter the quantity:");
                        qun=input1.nextInt();
                        System.out.println("Total Quantity :"+qun);
                        System.out.println("Total cost: Rs499/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");
                    }
                    else
                    {
                        System.out.println("wrong choice");
                    }
                }
                else 
                {
                    System.out.println("1.LEE COOPER  2.PARK AVENUE 3. REYMOND 4.LEVIS \n");
                    System.out.println("-----------CHOICE YOUR BRAND------------\n");
                    int w;
                    w = input1.nextInt();
                    if(w==1)
                    {
                        int h;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BLACK\n");
                        System.out.println("2 => DARK BLUE\n");  
                        System.out.println("3 =>  OFF WHITE \n");
                        h=input1.nextInt();

                        int g;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        g=input1.nextInt();
                        int quant=0;
                        System.out.println("Enter the quantity:");
                        quant=input1.nextInt();
                        System.out.println("Total Quantity :"+quant);
                        System.out.println("Total cost: Rs.675/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(w==2)
                    {
                        int h;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => BROWN\n");
                        System.out.println("2 => SKY BLUE\n");  
                        System.out.println("3 =>  WHITE \n");
                        h=input1.nextInt();

                        int g;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 30\n");  
                        System.out.println("3 => 32\n");
                        g=input1.nextInt();
                        int quant1=0;
                        System.out.println("Enter the quantity:");
                        quant1=input1.nextInt();
                        System.out.println("Total Quantity :"+quant1);
                        System.out.println("Total cost: Rs.540/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    } 
                    else if(w==3)
                    {
                        int h;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 =>VIOLET\n");
                        System.out.println("2 => RED\n");  
                        System.out.println("3 => PINK\n");
                        h=input1.nextInt();

                        int g;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>28\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        g=input1.nextInt();
                        int quant=0;
                        System.out.println("Enter the quantity:");
                        quant=input1.nextInt();
                        System.out.println("Total Quantity :"+quant);
                        System.out.println("Total cost: Rs.880/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");

                    }
                    else if(w==4)
                    {
                        int h;
                        System.out.println("CHOOSE YOUR COLOUR :............\n");
                        System.out.println("1 => YELLOW\n");
                        System.out.println("2 => GREEN\n");  
                        System.out.println("3 =>  GREY\n");
                        h=input1.nextInt();

                        int g;
                        System.out.println("CHOOSE YOUR SIZE:....................\n");
                        System.out.println("1 =>30\n");
                        System.out.println("2 => 32\n");  
                        System.out.println("3 => 34\n");
                        g=input1.nextInt();
                        int quant=0;
                        System.out.println("Enter the quantity:");
                        quant=input1.nextInt();
                        System.out.println("Total Quantity :"+quant);
                        System.out.println("Total cost: Rs499/-");
                        System.out.println("-------------THANKYOU FOR YOUR PURCHASE--------------------");
                        System.out.println("-------------HAVE A GOOD DAY--------------------");
                    }}
            }
        }
    }
}