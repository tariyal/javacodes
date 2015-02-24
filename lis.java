import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        static int findindex(int last[],int l,int r,int key)
        {    
            int m=0;
            while(r-l > 1)
            {
                m = (r+l)/2 ;
                if(last[m]>=key)
                    r = m;
                else
                    l = m;
            }
            return r;
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N=1,size=1,k=1,m=0,i=1;
        Scanner s  = new Scanner(System.in);
        N = s.nextInt();
        int last[] = new int[N];
        last[0] = Integer.MIN_VALUE;
    	if(N>0) last[0] = s.nextInt();
        for(i=1;i<N;i++)
        {
            k = s.nextInt();
            if(k>last[size-1])
                last[size++]=k;
            else if(last[0]>k)
                last[0] = k;
            else
            {
                m = findindex(last,-1,size-1,k);
                last[m] = k;       
            }
        }
       System.out.println(size);
    }
}
