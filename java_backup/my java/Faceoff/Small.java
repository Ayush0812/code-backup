import java.io.*;
class Small
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,w,w1;
        int i,max,min;
        max=0;
        w="";
        s=br.readLine();
        s=s+" ";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(w.length()>max)
                {
                    max=w.length();
                }
                w="";
            }
                else
                {w=w+s.charAt(i);
                }
            }
            w="";
            w1="";
            min=max;
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                {
                    if(w.length()<min)
                    {
                        min=w.length();
                        w1=w;
                    }
                    w="";
                }
                else
                w=w+s.charAt(i);
            }
            System.out.println(w1);
            System.out.println(min);
        }
    }


                
                    