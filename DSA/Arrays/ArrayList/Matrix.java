//Richest Customer Wealth-LeetCode 1672
public class Matrix { 
    public static int maximumWealth(int[][] accounts) {
       int max = Integer.MIN_VALUE;
       int m = accounts.length;
        for(int i=0; i<m; i++){
            int sum = 0;
            int n = accounts[i].length;
            for(int j=0; j<n;j++){
                sum += accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }

        return max;
    }


    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));

       } 
}
