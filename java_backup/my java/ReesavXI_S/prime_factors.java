import java.util.*;
class prime_factors
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        n=sc.nextInt();
    }
    void clac()
    {
        for(int i=2;i<=n;)
        {
            if(prime(i)==true)
            {
                if(n%i==0)
                {
                    n=n/i;
                    System.out.print(i+",");
                    continue;
                }
            }
            i++;
        }
    }
    boolean prime(int n)
    {
        int cr=0,i=n-1;
        while(i>2)
        {
            if(n%i==0)
            cr++;
            i--;
        }
        if(cr==0)
        return true;
        return false;
    }
}