class Solution {
   int sumofsquares(int n)
    {
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=x*x;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int fast=sumofsquares(n);
        int slow=n;
        while(fast!=slow)
        {
            slow=sumofsquares(slow);
            fast=sumofsquares(sumofsquares(fast));
        }
        return slow==1;
    }
    
}