import java.util.*;
public class cons
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter limit : ");
int n=sc.nextInt();
String a[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.print("str? : ");
a[i]=sc.nextLine();
}

for(int i=0;i<n;i++)
{
int c=0;
for(int j=0;j<a[i].length()-1;j++)
{
int k=(int)a[i].charAt(j);
int l=(int)a[i].charAt(j+1);
if(k-l==1||l-k==1)
{
c++;
}

}
if(c>0)
{
System.out.println(a[i]);
}
}
}
}