class Solution {
    public static void main(String [] args )
    {
        int[] arr={-12,8,-7,6,12,-9,14};
        System.out.println(posAverage(arr));
    }
    public static double posAverage(int[] arr) {
            double sum=0.0;
            int count=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=0)
                {
                    sum+=arr[i];
                    count++;
                }
            }
            if(count==0)
            {
                return 0.0;
            }
            double avg=sum/count;
            return avg;
        
    }
}
