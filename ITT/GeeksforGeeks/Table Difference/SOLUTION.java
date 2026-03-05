// User function Template for Java
class Solution {
    public static void main(String[] args)
    {
        int n1=9;
        int n2=4;
        difference(n1,n2);
    }
    public static void difference(int n1, int n2) {
        int n;
        int a;
        int b;
        if(n1>n2)
        {
            for(int i=1;i<=10;i++)
            {
                n=n1*i;
                a=n2*i;
                b=n-a;
                System.out.print(b+" ");
            }
        }
        
    }
}
