import java.util.*;
public class convN2O
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println();System.out.println("no.");
    double d=sc.nextDouble();
    int x=(int)d;
    double y=d-(double)x;
    int z=1;int n=0;
    int a[]=new int[126];
    System.out.println("octal : ");
    while(x>0)
    {
       a[n]=(x%8);
      n++;
        x=x/8;
        
    }
    for(int i=n-1;n>-1;n--)
    {
        System.out.print(a[n]);
   
    }
    System.out.println();
    /*
    {
     System.out.print(".");   
    int j=0;
    
    while(y>0)
    {
        y=y*2;
       if(y<1.00)
       {
       System.out.print("0");
       //y=y*2;
       j++;
    }
    else
    {
       System.out.print("1");
       y=y-1;
       j++;
    }
    //System.out.println("binary :"+z);
    if(j>4)
    break;
    }
    //System.out.println("binary :"+z);
    */
}
}