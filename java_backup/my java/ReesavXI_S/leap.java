import java.util.*;
class leap
{
    int year;
    String a[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    String day="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day ");
        day=sc.nextLine();
        System.out.print("Enter the year ");
        year=sc.nextInt();
    }
    void calc()
    {
        int i=0;
        for(int j=0;j<7;j++)
        {
            if(a[j].equals(day))
            {
                i=j;
                break;
            }
        }
        i=i+365+365+365+366;
        i=i%7;
        System.out.println(a[i]+" for year "+(year+4));
        i=i+365+365+365+366;
        i=i%7;
        System.out.println(a[i]+" for year "+(year+8));
        i=i+365+365+365+366;
        i=i%7;
        System.out.println(a[i]+" for year "+(year+12));
        i=i+365+365+365+366;
        i=i%7;
        System.out.println(a[i]+" for year "+(year+16));
    }
}