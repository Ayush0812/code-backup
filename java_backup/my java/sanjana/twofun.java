 

 

import java.io.*;
class twofun
{
String S;
int i,p;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
void input ()throws IOException
{
System.out.println("Enter String");
S=br.readLine();
convert(S);
}
void convert(String S)
{
p=0;
for (i=0;i<S.length();i++)
{
if(S.charAt (i)=='A'||S.charAt (i)=='a'||S.charAt (i)=='E'||S.charAt (i)=='e'||S.charAt (i)=='I'||S.charAt (i)=='i'||S.charAt (i)=='O'||S.charAt (i)=='o'||S.charAt (i)=='U'||S.charAt (i)=='u')
{
p=i;
break;
}
}
for (i=p; i<S.length();i++)
System.out.print(S.charAt (i));
for (i=0;i<p;i++)
System.out.print(S.charAt (i));
System.out.print("ay");
}
}