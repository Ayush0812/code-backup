class primegen
{
  public static void main (int a)
{
  int i,f,j;
  for (i=1;i<=a;i++)
{
  f=0;
  for (j=2;j<i;j++)
  if (i%j==0)
{
  f=1;
  break;
}
  if (f==0)
  System.out.println(i);
}
}
}  