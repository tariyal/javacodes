public class Solution {
    public int numDistinct(String S, String T) {
        int m  = S.length(),n = T.length(),i,j;
        if(m<n)
            return 0;
        int[][] a = new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(S.charAt(i)==T.charAt(j))
                    a[i][j]+= i>0&&j>0?a[i-1][j-1]:1;
                a[i][j] +=i>0&&i>j? a[i-1][j]:0;
                    
            }
        }
        return a[m-1][n-1];
    }
}
