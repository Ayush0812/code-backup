import java.io.*;
class bubblesort
{
    public static void main(String args[])throws IOException
    {
        int a[]=new int [100],i,n,pos,j,t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Term:");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.println("Elements before sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
       for(i=0;i<n;i++)
       for(j=0;j<n-i-1;j++)
       if(a[j]>a[j+1])
       {
           t=a[j];
           a[j]=a[j+1];
           a[j+1]=t;
        }
        
           
   System.out.println("Elements after sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
        
    }
}

      
           
        