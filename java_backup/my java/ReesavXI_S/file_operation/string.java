package file_operation;
import java.io.*;
import java.util.*;
class string
{
    String s="";
    void read()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fout=new FileWriter("String_reader.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        int ch=0;
        do
        {
            System.out.print("Enter a sentence :- ");
            pout.println(br.readLine()+" ");
            System.out.print("Enter 1 to exit or any other number to continue");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=1);
        pout.close();
    }
    void write()throws IOException
    {
        FileReader fr=new FileReader("String_reader.txt");
        BufferedReader br=new BufferedReader(fr);
        int j=1,words=0,vowels=0;
        while((s=br.readLine())!=null)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==' ')
                words++;
            }
            System.out.println("No of words in sentence no "+j+" = "+(words));
            words=0;
            for(int k=0;k<s.length();k++)
            {
                if(s.charAt(k)=='A'||s.charAt(k)=='E'||s.charAt(k)=='I'||s.charAt(k)=='O'||s.charAt(k)=='U'||s.charAt(k)=='a'||s.charAt(k)=='e'||s.charAt(k)=='i'||s.charAt(k)=='o'||s.charAt(k)=='u')
                vowels++;
            }
            System.out.println("No of vowels in sentence no "+j+" = "+(vowels));
            vowels=0;
            j=j+1;
        }
        br.close();
    }
    void main()throws IOException
    {
        string sg=new string();
        sg.read();
        sg.write();
    }
}
        