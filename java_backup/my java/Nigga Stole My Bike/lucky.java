import java.io.*;
public class lucky
{
    public static void main(String args[]) throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("limit");
        int n=Integer.parseInt(in.readLine());
        String b[]=new String[n];
        for(int i=0;i<n;i++)
        {
            //b[i]=new String();
            b[i]=in.readLine();
        }
        for(int i=2;i<=n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(b[j].equalsIgnoreCase(""))
                {
                    continue;
                }
                else
                {
                    c++;
                }
                if(c%i==0)
                {
                    b[c-1]="";
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(b[i]!="")
            {
                System.out.println(b[i]);
            }
        }
    }
}
                    
                    