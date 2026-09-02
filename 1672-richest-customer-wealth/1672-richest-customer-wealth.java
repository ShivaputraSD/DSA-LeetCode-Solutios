class Solution {
    public int maximumWealth(int[][] accounts) {
        int i,j,Max_Wealth=0;
        int sum=0;
        for(i=0;i<accounts.length;i++){
            sum=0;
            for(j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(Max_Wealth<sum)
                Max_Wealth=sum;
        }
        return Max_Wealth;
        
    }
}