//question - 10
public class PermutationSolution {

	
	public static int PermutationSolution(int a[]) {
		int natural=a.length+1;
		int b=1;
		for(int i:a)
			if(i>=natural)
				b=0;
		
		return b;
	}

}
