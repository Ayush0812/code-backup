
import java.io.*;
public class prime
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        int max,i,k,c,j,k1,k2,f,n,m;
        System.out.println("Enter term:");
        n=Integer.parseInt(br.readLine());
        //k2=Integer.parseInt(br.readLine());
        max=0;
        k2=0;
        for(i=1;i<=n;i++)
        {k=Integer.parseInt(br.readLine());
            k1=k;c=0;
            while(k1>0)
            {m=k1%10;f=0;
                for(j=2;j<m;j++)
                {if(m%j==0)
                    {f=1;
                        break;
                    }
                }
                    if(f==0)
                    {c++;
                    }
                
                k1=k1/10;
            }
            if(c>max)
            {max=c;
                k2=k;
            }
        }
        System.out.println(k2+":"+max);
    }
}