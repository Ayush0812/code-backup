import java.util.*;
class Pattern
  {
   void pattern1()
     {
      int sp=15;
      for (int i=1; i<=5; i++)
        {
         for (int j=1; j<=sp; j++)
         System.out.println (" ");
         for (int j=1; j<=i; j++)
         System.out.println (j+" ");
         sp=sp-1;
         System.out.println (" ");
        }
      sp+=1;
      for (int i=4; i>=1; i--)
        {
         for (int j=1; j<=sp; j++)
         System.out.println (" ");
        }
    }
}
         