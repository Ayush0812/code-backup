class pyramidalpha
{
    void main()
    {
        for(int i='a';i<='e';i++)
        {
            for(int j='e';j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k='a';k<=i;k++)
            {
                System.out.print((char)k+" ");
            }
            for(int l=i-1;l>='a';l--)
            {
                System.out.print((char)l+" ");
            }
            System.out.println(" ");
        }
    }
}