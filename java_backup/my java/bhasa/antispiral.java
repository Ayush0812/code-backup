import java.io.*;
class antispiral
{
public static void main(String args[])throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array dimension");
n=Integer.parseInt(br.readLine());
int ar[][]=new int[n][n];
int i,j;
int p,k,u,c=n-1,u1;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
ar[i][j]=0;
}
}
p=1;
k=n*n;
int r=0;
u=n;
i=j=0;
u1=0;
while(k>=p)
{
i=r;
j=c;
while(j>=u1)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k--;
}
j--;
}
j=j+1;
i=i+1;
while(i<u)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k--;
}
i++;
}
i=i-1;
j=j+1;

while(j<u)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k--;
}
j++;
}
j=j-1;
i=i-1;
while(i>u1)
{
if(ar[i][j]==0)
{
ar[i][j]=k;
k--;
}
i--;
}
r=r+1;
c=c-1;
u1=u1+1;
u=u-1;
}
System.out.println("the spiral matrix is: ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(ar[i][j]+",");
}
System.out.println("");
}
}
}