
class perfect
{
int n,i,s;
perfect()
{
n=0;
s=0;
}
perfect(int l)
{
n=l;
}
void perfect_sq()
{
int c=0;
for(i=1;;i++)
{
s=i*i;
if(s>n)
{
System.out.println(s);
c++;
}
if(c==5)
break;
}
}
void sum_of()
{
int i,j,c=0,s=0;
for(i=1;i<n;i++)
{
for(j=i;j<n;j++)
{
s=s+j;
c++;
if(s>=n)
break;
}
if(s==n)
{
for(j=i;j<c+i;j++)
System.out.print(j+"\t");
System.out.println("");
}
s=c=0;
}
}
}

