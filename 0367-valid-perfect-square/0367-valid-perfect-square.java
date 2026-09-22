class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2)
            return true;
        long i=1,j=num;
        while(i<=j){
            long mid=i+(j-i)/2;
            long square=mid*mid;
            if (square==num)
                return true;
            if(square<num) i=mid+1; else j=mid-1;
        }
        return false;
        
    }
}