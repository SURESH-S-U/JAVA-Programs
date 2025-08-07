public class sample {
    public static int largestSumAfterKNegations(int[] arr, int k) {

        for(int i=0;i<k;i++)
        {
            int min = 0;

            for(int j=0;j<arr.length;j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            arr[min] = -arr[min];
        }

        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }

        return sum;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {4,2,3};
        int k = 1;
        
        System.out.println(largestSumAfterKNegations(arr , k));
        
    }
}