public class Solution {

	
	public static int Solution(int a[]) {
		int natural=1;
		for(int i=0;i<a.length;i++)
		{
			if(natural==a[i]) {
				natural++;
			}
		}
		return natural;
	}

}
