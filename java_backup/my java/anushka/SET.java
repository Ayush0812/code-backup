
import java.io.*;
public class SET
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int arr[];int n;int i,k,m;
    SET(int nn)throws IOException
    {
       System.out.println("Enter Data:");
        //n=Integer.parseInt(br.readLine());
       n=nn;
        arr=new int[nn];
       //System.out.println(getsize());
    }
    void readelements()throws IOException
    {
        for(i=0;i<getsize();i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter searching element:");
        m=Integer.parseInt(br.readLine());
        if(has(m)==1)
          System.out.println("element found....");
        else
         System.out.println("element not found....");
    }
    void displyelements()
    {
        for(i=0;i<getsize();i++)
        {
            System.out.println(arr[i]);
        }
    }
    int getsize()
    {
        if(n>=4&&n<=50)
        {
            return n;
        }
        else 
           return 0;
    }
    int has(int ele)
    {
        int f=0;
        for(i=0;i<getsize();i++)
        {
        if(ele==arr[i])
        {
            f=1;
            break;
        }
    }
        if(f==1)
        return 1;
        else
        return 0;
    }
    
    SET intersection(SET d)throws IOException
    {
        SET k=new SET(50);
        int i,t;t=0;
        for(i=0;i<this.arr.length;i++)
        {
            if(this.arr[i]==d.arr[i])
            {
                k.arr[t]=this.arr[i];
                t++;
            }
        }
        return k;
    }
    SET union(SET d)throws IOException
    {
        SET k=new SET(50);
        int i,t;t=0;
        for(i=0;i<this.arr.length;i++)
        {
            k.arr[t]=this.arr[i];
            t++;
        }
        return k;
    }
}
    


    