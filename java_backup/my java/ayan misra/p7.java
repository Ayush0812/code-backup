public class p7
{
    public static void main(String args[])
    {
    int a,b,k=5,sp=4;
    for(a=1;a<=5;a++)
    {
        for(int x=1;x<=sp;x++)
        {
            System.out.print(" ");
        }
        for(b=k;b<=5;b++)
        {
            System.out.print(b);
        }
        System.out.println(" ");
        k--;
        sp--;
    }
}
}