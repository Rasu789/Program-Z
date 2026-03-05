import java.util.Scanner;
class Solution {
    public static void main(String [] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a number 1 and number 2:");
       int n=s.nextInt();
       int m=s.nextInt();
       System.out.println(compareNM(n,m));
       
    }
    public static String compareNM(int n, int m) {
        if(n<m)
        {
            return "lesser";
        }
        else if(n==m)
        {
            return "equal";
        }
        else
        {
            return "greater";
        }
          
    }
}
