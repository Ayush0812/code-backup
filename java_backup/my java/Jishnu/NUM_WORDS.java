class NUM_WORDS
{
void main(int n)
{
if(n>=10000||n<=-10000)
{
System.out.println(" Max 4 Digits");
System.exit(0);
}
if(n<0)
{
System.out.print("minus ");
}
n=Math.abs(n);
String teen[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
String tens[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
String unit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
int t=0;
String ans="";
if(n>9&&n<20)
{
System.out.println(teen[n-10]);
System.exit(0);
}
if(n==0)
{
System.out.println("zero");
}
for(int i=1;n!=0;i++)
{
t=n%10;
if(i==1&&t!=0)
{
ans=unit[t]+ans;
}


else if(i==2&&t!=0)
{
ans=tens[t-2]+" "+ans;
}
else if(i==3&&t!=0)
{
ans = unit[t]+" hundred "+ans;
}
else if(i==4 && t!=0)
{
ans=unit[t]+" thousand "+ans;
}
n/=10;}
System.out.println(ans);
}
}