class Solution {
    public int countMonobit(int n) {
        int count=0;
        if(n>=0)
        {
            count++;
        }
        for(int i=1;i<=n;i++)
            {
                if((i&(i+1))==0)
                {
                    count++;
                }
            }
        return count;
    }
}