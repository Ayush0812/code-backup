import java.io.*;
class perfect
{

int N;
 perfect(int n)
{
   N=n;
}
void perfect_sq()
{
  int m,c;
  double k;
  m=N+1;
  c=1;
  while(c<=6)
  {
    k=Math.sqrt(m);
    if((int)k==k)
    {
        System.out.print(m+",");
        c++;
    }
      
   m++;
}
}
void sum_of()
{
    int i,s,k,j;
    System.out.println("");
    for(i=1;i<N;i++)
    {
        s=0;
        for(j=i;j<N;j++)
        {
            s=s+j;
            if(s==N)
            {
                for(k=i;k<=j;k++)
                 System.out.print(k+",");
              System.out.println("");
              break;
            }
            else
            if(s>N)
            {
              break;
            }
        }
    }
}
public static void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n;
     System.out.println("enter number:");
     n=Integer.parseInt(br.readLine());
    perfect p=new perfect(n);
   p.perfect_sq();
   p.sum_of();
}
}
    
  