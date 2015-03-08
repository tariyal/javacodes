public class Solution {
    public int findPeakElement(int[] num) {
        return  peak(0,num.length-1,num);
    }
    public int peak(int start,int end,int[] num)
    {
        if(start==end)
            return start;
        if(start+1==end)
            return num[start] > num[end] ? start:end;
        int mid = (start+end)/2;
        
        if(num[mid-1]>num[mid])
            return peak(start,mid-1,num);
        
        if(num[mid+1]>num[mid])
            return peak(mid+1,end,num);
            
        return mid;
    }
    
}
