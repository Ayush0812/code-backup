import java.io.*;
public class volume
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        System.out.println("ENTER c TO CALCULATE VOLUME OF A CUBE.");
        System.out.println("ENTER s TO CALCULATE VOLUME OF A SPHERE.");
        System.out.println("ENTER b TO CALCULATE VOLUME OF A CUBOID.");
        System.out.println("ENTER YOUR CHOICE ::");
        String input = (br.readLine());
        int s1,r1,l1,b1,h1;double volume;
        double pi = (22/7);
        double ft = (4/3);
        switch(input)
        {
            case "c" :
            {
                System.out.println("ENTER THE SIDE OF THE CUBE ::");
                s1=Integer.parseInt(br.readLine());
                volume = s1*s1*s1;
                System.out.println("VOLUME OF CUBE = "+volume);
            	break;
            }
            case "s" :
            {            
                System.out.println("ENTER THE RADIUS OF THE SPHERE ::");
                r1=Integer.parseInt(br.readLine());
                volume = ft*pi*(r1*r1*r1);
                System.out.println("VOLUME OF SPHERE = "+volume);
		        break;            
		    }
            case "b" :
            {
                System.out.println("ENTER THE LENGTH OF THE CUBOID ::");
                l1=Integer.parseInt(br.readLine());
                System.out.println("ENTER THE BREADTH OF THE CUBOID ::");
                b1=Integer.parseInt(br.readLine());
                System.out.println("ENTER THE HEIGHT OF THE CUBOID ::");
                h1=Integer.parseInt(br.readLine());
                volume = l1*b1*h1;
                System.out.println("VOLUME OF CUBOID = "+volume);
            	break;
            }
            default :
            {
                System.out.println("WRONG INPUT");
            }
        }
    }
}