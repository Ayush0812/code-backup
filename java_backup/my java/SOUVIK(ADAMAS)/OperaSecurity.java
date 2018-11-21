 import java.io.*;
class OperaSecurity
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    int l,len,i,j;
    char ch;
    public void check()throws IOException
    {
        System.out.println("Enter code");
        s=br.readLine();
        System.out.println("Enter length");
        len=Integer.parseInt(br.readLine());
        l=s.length();
        if(len!=l)
        {
            System.out.println("Invalid!Incorrect string length specified");
            System.exit(0);
        }
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    System.out.println("Invalid!Repitition not allowed");
                    System.exit(0);
                }
            }
            ch=s.charAt(i);
            if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
            {
                System.out.println("Invalid!Only upper case letters accepted");
                System.exit(0);
            }
            if(ch!='A'&&ch!='C'&&ch!='E'&&ch!='G'&&ch!='I'&&ch!='K')
            {
                System.out.println("Invalid!Only alternate letters permitted");
                System.exit(0);
            }
        }
        if(l>6)
        {
            System.out.println("Invalid!Maximum of six characters permitted");
            System.exit(0);
        }
        System.out.println("Valid!");
    }
    public void main()throws IOException
    {
        check();
    }
}
        