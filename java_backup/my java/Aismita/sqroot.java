import java.io.*;
class sqroot
{
    public static void main(double n)
    {
        double i=1.000; double s=0.001;double k=0; double p=0;
        while(i<n)
        {
            p=i*i;
            if(p>n)
            {
                k=i;
                break;
            }
            else
            i=i+s;
        }
        double sqrt=k-s;
        System.out.println(+sqrt);
       
}
}
        