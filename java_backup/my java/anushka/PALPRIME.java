
import java.io.*;
public class PALPRIME
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,i,f,s,n,n1;;s=0;f=0;
        n=Integer.parseInt(br.readLine());
        for(i=2;i<n;i++)
        {if(n%i==0)
            {f=1;
                break;
            }
        }if(f==0)
            {n1=n;
                while(n1>0)
                {a=n1%10;
                    s=(s*10)+a;
                    n1=n1/10;
                }
            }
       
        if(s==n&&f==0)
        {System.out.println(n);
        }
        else
        System.out.println("non palin prime:");
    }
}
                
                
       
        