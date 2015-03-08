import java.util.*;
public class Permutations{
	public static void main(String[] args){

		Scanner user = new Scanner(System.in);
		String s = user.next();
		char ar[] = s.toCharArray();
		Arrays.sort(ar);
		String sorted = String.valueOf(ar);
		permute("",sorted,sorted.length());
	}
	public static void permute(String prefix,String s, int k)
	{
		int n = s.length();
		int i;
		if(k==0) System.out.println(prefix);
		else
		{
				for(i=0;i<n;i++)
			{
				permute(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n),k-1);
			}
		}
	}
}
