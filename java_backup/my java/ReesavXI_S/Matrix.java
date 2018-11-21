import java.util.*;
class Matrix
{
    int size;
    int ar[][];
    Matrix(int n)
    {
        size=n;
        ar=new int[size][size];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print("Enter a number ");
                ar[i][j]=sc.nextInt();
            }
        }
    }
    Matrix transpose()
    {
        Matrix t=new Matrix(size);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                t.ar[i][j]=this.ar[j][i];
            }
        }
        return t;
    }
    Matrix sum(Matrix b)
    {
        Matrix sum=new Matrix(size);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                sum.ar[i][j]=this.ar[i][j]+b.ar[i][j];
            }
        }
        return sum;
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array 1 ");
        size=sc.nextInt();
        Matrix A=new Matrix(size);
        System.out.println("Enter elements of Array A ");
        A.input();
        A.display();
        System.out.print("Enter size of Array 2 ");
        size=sc.nextInt();
        Matrix B=new Matrix(size);
        System.out.println("Enter elements of Array B ");
        B.input();
        B.display();
        Matrix C=new Matrix(size);
        C=B.sum(A);
        System.out.print("Sum of A and B ");
        C.display();
    }
}