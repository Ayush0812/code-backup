import java.util.*;
public class magicsquare
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int p,q,a,c,h,g,m=0,n=0;
        
        System.out.println("Enter limit");
        a=sc.nextInt();
        
        int b[][]=new int[a][a];
        p=a/2;
        q=0;
        for(c=1;c<=Math.pow(a,2);c++)
        {
            if(b[q][p]==0)
            {
                b[q][p]=c;
            }
            m=q;n=p;
            m=m+1;
            n=n+1;
            if(m>=a)
            {
                m=0;
            }
            if(n>=a)
            {
                n=0;
            }
            if(b[m][n]==0)
            {
                q++;
                p++;
               if(q>=a)
                {
                    q=0;
                }
                if(p>=a)
               {
                p=0;
               }
            }
            else
            {
                q++;
                if(q>=a)
                {
                    q=0;
                }
            }
        }
        for(g=0;g<a;g++)
        {
            for(h=0;h<a;h++)
            {
                System.out.print(" "+b[g][h]+" ");
            }
            System.out.println();
        }
    }
}
                
            

                    
                
        