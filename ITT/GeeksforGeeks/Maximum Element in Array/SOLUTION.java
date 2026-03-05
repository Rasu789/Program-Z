class Solution {
    public static void main(String [] args)
    {
        int[] arr={1,8,7,56,90};
        System.out.println(largest(arr));
    }
    public static int largest(int[] arr) {
        if(arr.length==0)
        {
            return -1;
        }
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=large)
            {
                large=arr[i];
            }
        }
        return large;
    }
}
