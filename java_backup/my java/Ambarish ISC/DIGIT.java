class DIGIT
{
public static void main(int n)
{
         int n1,r,d,k,p,q,q1,c,s=0;
         n1=n;
         c=0;
         while(n1>0)
         {
            c++;
            n1=n1/10;
        }
        k=c/2;
        p=(int)Math.pow(10,k);
        q=n%p;
        q1=n/p;
        s=s+(q*p)+q1;
        System.out.println(s);
    }
}
        