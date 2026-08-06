class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i,j=0;
        int miss=0;
        int count=0;
        int n=arr.length;
        for(i=1;i<=2000;i++)
        {
            if(j<n && i==arr[j])
            {
                j++;
            }
            else
            {
                miss=i;
                count++;
            }
            if(count==k)
            {
                return miss;
            }
        }
        return 0;
    }
}