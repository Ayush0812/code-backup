import java.util.*;
class Series
{
    int a,n,s=0,i;
    Series()
    {
        a=0;
        n=0;
    }
    void abc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and n:");
        a=sc.nextInt();
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
            s=s+a*i;
            else
            s=s-a*i;
        }
        System.out.println("Sum of series is="+s);
    }
    public static void main(String args[])
    {
        Series obj=new Series();
        obj.abc();
    }
}