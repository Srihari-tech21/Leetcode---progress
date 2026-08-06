class Solution {
    public int reverse(int n) {
        long rev=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return (int)rev;
        }
    }
}