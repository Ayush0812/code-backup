package prac_exam;
import java.util.*;
class matrix
{
    int m,n=0;
    int a[][];
    matrix(int v,int b)
    {
        m=v;
        n=b;
        a=new int [m][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("enter a number");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void clac()
    {
        int i=0,j=0,sum1=0,sum2=0,sum3=0,sum4=0;
        for(i=0,j=0;i<m;i++)
        sum1=sum1+a[i][j];
        for(i=0,j=(n-1);i<m;i++)
        sum2=sum2+a[i][j];
        for(j=0,i=0;j<n;j++)
        sum3=sum3+a[i][j];
        for(j=0,i=(n-1);j<n;j++)
        sum4=sum4+a[i][j];
        System.out.print(sum1+" "+sum2+" "+sum3+" "+sum4);
    }
}