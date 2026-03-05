// User function Template for Java
class Solution {
    public static void main(String [] args)
    {
        System.out.println(find_greatest_number(1,2,3)+"is the greatest number");
        
    }

    public static int find_greatest_number(int a, int b, int c) {
       if(a>=b && a>=c)
       {
           return a;
       }
       else if(b>=a && b>=c)
       {
           return b;
       }
       else
       {
           return c;
       }
        // Write your code here..
    }
}
