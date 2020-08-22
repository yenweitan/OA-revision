class Solution {
    public boolean isPalindrome(int x) {
        //algo or conditions to check whether x is palindrome
        if(x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
    
    
    int revertedNum = 0;
    while(x > revertedNum)
    {
        revertedNum = revertedNum * 10 + x % 10;
        x /= 10;
    }
    
    //midpoint num not significant for palindrome criteria, so just ignore or dump it
    
    return x == revertedNum || x == revertedNum / 10;
        
    }
}