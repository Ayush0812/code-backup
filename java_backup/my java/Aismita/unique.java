import java.io.*;
class unique
{
    public static void main(int n)
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int i=0;int c=0;int n1=n;int j=0;
        while(n!=0)
        {
            int p=n%10;
            c++;
            n/=10;
        }
        int a[]=new int[c];
        while(n1!=0)
        {
            int p=n1%10;
            a[i]=p;
            i++;
            n1/=10;
        }
        int c1=0;
        for(i=0;i<c;i++)
        {
            c1=0;
            for(j=0;j<c;j++)
            {
                if(a[j]==a[i])
                c1++;
            }
        }
        if(c1>=1)
        System.out.println("Unique");
        else
        System.out.println("Not unique");
    }
}
       
        