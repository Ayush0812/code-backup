import java.io.*;
class Happynumber_Ramjeenumber 
{
    int n,num,a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Happynumber_Ramjeenumber ()throws IOException
    {
        num=Integer.parseInt(br.readLine());
        a=0;
        isHappy(num,a);
    }
    int sum_sq_digits(int x,int a)
    {
        if(x<=0)
         return a;
        else 
         {
             a=a+(x%10*x%10);
             return(sum_sq_digits( x/10, a));
            }
    }
    void isHappy(int n,int a)
    {
      
       if(n>=10)
       {
         a=a+sum_sq_digits(n,a);
         n=a;
         a=0;
         isHappy( n,a);
        }
        else
        {
        if(n==1)
        {
            System.out.print("HAPPY");
        }else
            System.out.print("UNHAPPY"+num);
            return;
        }
    
    }
}
        