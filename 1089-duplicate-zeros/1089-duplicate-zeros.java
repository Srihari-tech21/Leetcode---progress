class Solution {
    public void rotateright(int [] arr, int i, int j)
    {
        for(int k=j;k>i;k--)
        {
            arr[k]=arr[k-1];
        }
    }
    public void duplicateZeros(int[] arr) {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                if(j+1<arr.length)
                {
                rotateright(arr,j+1,arr.length-1);
                arr[j+1]=0;
                j++;
                }
            }
        }
    }
}