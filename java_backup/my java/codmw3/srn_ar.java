import java.util.*;
public class srn_ar
{
    Scanner sc=new Scanner(System.in);
    String s,ar[];
    void input()
    {
        int a,c;
        String w="";
        System.out.println("Enter sentence");
        s=sc.nextLine();
        c=0;
        for(a=0;a<s.length();a++)
           {
               if(s.charAt(a)==' ')
               {
                  c++;
               }
            }
            
            ar=new String[c+1];
            c=0;
            for(a=0;a<s.length();a++)
            {
                if(s.charAt(a)==' ')
                {
                    ar[c++]=w;
                    w="";
                }
                else
                {
                    w+=s.charAt(a);
                }
            }
                    ar[c]=w;
    }
    void sort()
    {
        int m,n;
        String d1,d2,st1,st2,k;
        String k1,k2;
        for(m=0;m<ar.length;m++)
        {
            for(n=0;n<ar.length-1;n++)
            {
                d1=ar[n];
                d2=ar[n+1];
                k1="";
                k2="";
                if(d1.charAt(d1.length()-1)=='.' || d1.charAt(d1.length()-1)==',')
                {
                    k1+=d1.charAt(d1.length()-1);
                    st1=d1.substring(0,d1.length()-1);
                }
                else
                {
                    k1="";
                    st1=d1;
                }
                 if(d2.charAt(d2.length()-1)=='.' || d2.charAt(d2.length()-1)==',')
                {
                    k2+=d2.charAt(d2.length()-1);
                    st2=d2.substring(0,d2.length()-1);
                }
                else
                {
                    k2="";
                    st2=d2;
                }  
                if(st1.compareTo(st2)>0)
                {
                k=st1;
                st1=st2;
                st2=k;
                ar[n]=st1+k1;
                ar[n+1]=st2+k2;
            }
        }
        }
        for(m=0;m<ar.length;m++)
        {
            System.out.print(ar[m]+" ");
        }
    }
}               