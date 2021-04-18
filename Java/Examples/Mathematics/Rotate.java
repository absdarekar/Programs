public class Rotate
{
  public static void main(String args[])
  {
    int[] A={1,2,3};
    int order=3;
    int[] B=new int[order];
    int i=0,j=0;
    for(i=0;i<=order-1;i++)
    {
      System.out.print(A[i]+" ");
    }
    System.out.println();
    B=A;
    for(i=0;i<=order-2;i++)
    {
      for(j=0;j<=order-1;j++)
      {
        B=rotate(order,B);
        System.out.print(B[j]+" ");
      }
      System.out.println();
    }
  }
  // public static int[] rotate(int order,int[] A)
  // {
  //   int[] B=new int[order];
  //   int i=0;
  //   for(i=0;i<=order-1;i++)
  //   {
  //     if(i==order-1)
  //       B[order-1]=A[0];
  //     if(i!=order-1)
  //       B[i]=A[i+1];
  //   }
  //   return B;
  // }
  public static int[] rotate(int order,int[] A)
  {
    int[] B=new int[order];
    int i=0,j=0;
    for(i=0;i<=order-1;i++)
    {
      if(i-1==-1)
        B[i]=A[order-1];
      else
        B[i]=A[i-1];
    }
    return B;
  }
}
