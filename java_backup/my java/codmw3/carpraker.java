
import java.util.*;
public class carpraker
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,c,st1,st2,st3;
        String b="";
        System.out.println("Enter number ");
        a=sc.nextInt();
        b=b+(int)(Math.pow(a,2));
        c=b.length();
        st1=(int)(Math.pow(a,2)%(Math.pow(10,c/2)));
        st2=(int)(Math.pow(a,2)/(Math.pow(10,c/2)));
        System.out.println(+st1);
        System.out.println(+st2);
        st3=st1+st2;
        if(st3==a)
        {
            System.out.println("Crapraker number");
       }
    }
}
        