import java.util.Scanner;
class Solution {
    
    public static void main(String [] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int ans=returnValueFunction(n);
        System.out.println(ans);
    }
    static int returnValueFunction(int n)
    {
        return 2*n;
    }
}
