import java . io.*;
class pat2
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j;
for(i=5;i>=1;i--)
{
for(j=5;j>=i;j--)
{
System.out.print('a');
}
System.out.println();
}
}
}

