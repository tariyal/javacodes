public class Solution {
    List<Integer> temp;
    List<List<Integer> > ans;
    int len;
    boolean visited[];
    public List<List<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        len = num.length;
        temp = new ArrayList<Integer>();
        ans =  new ArrayList<List<Integer> >();
        visited = new boolean[len];
        dopermute(0,num);
        return ans;
    }
    public void dopermute(int k,int[] num)
    {
        if(k==len)
        {
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<len;i++)
        {
            
            if(!visited[i])
            {
               if (i > 0 && num[i] == num[i-1] && visited[i-1]) {
                    return;
                }
               temp.add(num[i]);
               visited[i]=true;
               dopermute(k+1,num);
               visited[i]=false;
               temp.remove(k);
            }
        }
    }
}
