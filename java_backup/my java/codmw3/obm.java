import java.util.*;
public class obm
{
    Scanner sc=new Scanner(System.in);
    int ar[],n;
    void input(int k)
    {
        n=k;
        ar=new int [k];
    }
    void insert()
    {
        int a;
        for(a=0;a<n;a++)
        {
            System.out.println("Enter element");
            ar[a]=sc.nextInt();
        }
    }
    void sort()
    {
        int m,k,i;
        for(m=0;m<n;m++)
        {
            for(i=0;i<n-1;i++)
            {
                if(ar[i]>ar[i+1])
                {
                    k=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=k;
                }                
            }
        }
    }
    obm merge(obm ob1,obm ob2)
    {
        int c1,c2,c3,a,b,m;
        obm ob3=new obm();
        a=ob1.n;
        b=ob2.n;
        ob3.input(ob2.n+ob1.n);
        c1=0;c2=0;c3=0;
        while(c1!=a && c2!=b)
        {
            if(ob1.ar[c1]>ob2.ar[c2])
            {
                ob3.ar[c3]=ob2.ar[c2];
                c2++;
                c3++;
            }
            else if(ob2.ar[c2]>ob1.ar[c1])
            {
                ob3.ar[c3]=ob1.ar[c1];
                c1++;
                c3++;
            }
            else if(ob1.ar[c1]==ob2.ar[c2])
            {
                ob3.ar[c3]=ob2.ar[c2];
                c2++;
                c3++;
                c1++;
            }
        }
        if(c1==a)
        {
            for(m=c2;m<b;m++)
            {
                ob3.ar[c3]=ob2.ar[m];
                c3++;
            }
        }
         if(c2==b)
        {
            for(m=c1;m<a;m++)
            {
                ob3.ar[c3]=ob1.ar[m];
                c3++;
            }
        }
        return ob3;
    }
    void display()
    {
        int m;
        for(m=0;m<n;m++)
        {
            System.out.println(+ar[m]);
        }
    }
    void main()
    {
        obm a1=new obm();
        obm a2=new obm();
        System.out.println("Enter limit1");
        a1.input(sc.nextInt());
        System.out.println("Enter limit2");
        a2.input(sc.nextInt());
        a1.insert();
        a2.insert();
        a1.sort();
        a2.sort();
        obm a3=merge(a1,a2);
        a3.display();
    }
}