import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner user = new Scanner(System.in);
        int i,j,m = user.nextInt();
        int n = user.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int lcs[][] = new int[m+1][n+1];
        for(i=0;i<m;i++)
            a[i] = user.nextInt();
        for(i=0;i<n;i++)
            b[i] = user.nextInt();
        for(i=0;i<=m;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==0 || j==0)
                    lcs[i][j]=0;
                else if(a[i-1]==b[j-1])
                    lcs[i][j] = lcs[i-1][j-1]+1;
                else
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
        Stack<Integer> st = new Stack<Integer>();
        while(m>0 &&n>0)
        {
            if(a[m-1]==b[n-1])
            {    st.push(a[m-1]);
                m--;n--;
            }
            else if(lcs[m-1][n] > lcs[m][n-1])
                m--;
            else
                n--;
        }
         while(!st.isEmpty()){
			   System.out.print(st.pop()+" ");
		   }
    }
