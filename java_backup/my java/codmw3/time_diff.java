import java.util.*;
public class time_diff
{
    int h,m,s;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hour");
        h=sc.nextInt();
        System.out.println("Enter minutes");
        m=sc.nextInt();
        System.out.println("Enter seconds");
        s=sc.nextInt();
    }
    void cal(time_diff ob)
    {
        int st2,st1,st3,st4;
        if(this.h>ob.h)
        {
            st1=(this.h-ob.h)*3600;
            st2=(this.m-ob.m)*60;
            st3=this.s-ob.s;
            
        }
        else
        {
            st1=(ob.h-this.h)*3600;
            st2=(ob.m-this.m)*60;
            st3=ob.s-this.s;
        }
        st4=st1+st2+st3;
        System.out.println(+st4);
    }
    void main()
    {
     time_diff k=new time_diff();
     time_diff k2=new time_diff();
     k.input();
     k2.input();
     k.cal(k2);
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        
        
        
        