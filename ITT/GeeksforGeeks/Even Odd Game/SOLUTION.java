import java.util.Scanner;
class Solution {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(utility(n));
    }
    public static String utility(int n) {
        if(n%2==0)
        {
            return "Friend";
        }
        else
        {
            return "You";
        }

        // write your code here
        
    }
}
