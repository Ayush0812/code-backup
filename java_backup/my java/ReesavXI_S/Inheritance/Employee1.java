package Inheritance;
import java.util.*;
class Employee1
{
    String name="";
    int code;
    int BASIC;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name ");
        name=sc.nextLine();
        System.out.print("Enter your code ");
        code=sc.nextInt();
        System.out.print("Enter your BASIC pay ");
        BASIC=sc.nextInt();
    }
    void show()
    {
        System.out.println("Your name :- "+name);
        System.out.println("Your code :- "+code);
        System.out.println("Your BASIC pay :- "+BASIC);
    }
}