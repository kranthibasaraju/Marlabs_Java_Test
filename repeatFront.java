//Question 4
import java.io.StringReader;

public class repeatFront {
	public static String repeatFront(String s,int n)
	{
		String repeat = s.substring(0, n);
		String result="";
		result=result.concat(repeat);
		while(true) {
			if(n==0)
				break;
			result=result.concat(result.substring(0,--n));
		}
		return result;
	}

}
