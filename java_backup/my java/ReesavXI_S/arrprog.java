import java.util.*;
class arrprog
{
    int n,s,max,min,k=-1,c;
    int a[];
    int b[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
    }
    void inputarr()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter prime number ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to be searched ");
        s=sc.nextInt();
    }
    void max_min()
    {
        min=a[0];max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
            else if(a[i]<min)
            min=a[i];
        }
    }
    void find(int s)
    {
        for(int j=0;j<n;j++)
        {
            if(b[j]==s)
            c=1;
        }
        if(c==1)
        {
            System.out.println(s);
            return;
        }
        else if(c!=1)
        {
            b[++k]=s;
            c=0;
        }
        if(s==max)
        {
            System.out.println(s);
            return;
        }
        else if(s==min)
        {
            System.out.println(s);
            return;
        }
        else
        {
            int max1=0;
            int max2=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]>max1&&a[i]<s)
                max1=a[i];
                else if(a[i]<=max&&a[i]>s)
                max2=a[i];
            }
            System.out.print(max1+" "+s+" "+max2+" ");
            System.out.println();
            find(max1);
            find(max2);
        }
    }
    void main()
    {
        arrprog arr=new arrprog();
        arr.input();
        arr.inputarr();
        arr.max_min();
        arr.find(s);
    }
}