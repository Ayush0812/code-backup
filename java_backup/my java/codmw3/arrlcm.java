import java.util.*;
public class arrlcm
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,c,m,n,k,fl,d,pr=1;
        
        System.out.println("Enter Limit");
        a=sc.nextInt();
        
        int b[]=new int[a];
        for(c=0;c<a;c=c+1)
        {
            System.out.println("Enter number");
            b[c]=sc.nextInt();
        
        }
       
        
        for(m=0;m<a;m=m+1)
        {
            for(n=0;n<a-1-m;n=n+1)
            {
                if(b[n]>b[n+1])
                {
                    k=b[n];
                    b[n]=b[n+1];
                    b[n+1]=k;
                }
            }
        }
        d=b[a-1];
        fl=0;
       for(m=2;m<d+1;m=m+1)
       {
           pr=pr*2;
           for(n=0;n<a;n=n+1)
           {
            if(pr%b[n]==0)
            {
                fl=1;
            }
            else
            {
                fl=0;
            }
             
        }
        if(fl==1)
        
    {
    
       System.out.println(+pr);
       break;
       
        }
    }
}   
}