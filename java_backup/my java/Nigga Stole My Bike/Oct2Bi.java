import java.util.*;
public class Oct2Bi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("oct no.");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                System.out.print(".");
                continue;
            }
            int c=(int)s.charAt(i)-48;
            String z="";
            while(c>0)
            {
                z=z+(char)((c%2)+48);
                c=c/2;
             }
             System.out.print(z);
            }
        }
    }