import java.io.*;
class admirable
{
    Boolean Calc(int x)
    {
        int a[]=new int[100];
        int count=0;
        for(int i=1;i<=(x/2);i++)
        {
            if(x%i==0)
                a[count++]=i;
        }
        int b[]=new int[count];
        for(int i=0;i<count;i++)
        {
            b[i]=a[i];
        }
        int sum,j;
        sum=j=0;
        for(int k=0;k<count;k++)
        {
        for(int i=0;i<count;i++)
        {
            if(i!=j)
                sum=sum+b[i];
            else
                sum=sum-b[j];
            j++;
                if(sum==x)
                return true;
   
            
        }
        
    }return false;}
}
                