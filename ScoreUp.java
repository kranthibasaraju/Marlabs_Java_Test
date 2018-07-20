
public class ScoreUp {
	public static int ScoreUp(String a[],String b[]) {
		int result=0;
		int correct=0;
		int incorrect=0;
		int blank=0;
		if((a.length==0 && b.length==0) || (a.length!=b.length))
			result=0;
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i])
					correct=correct+4;
				else if (b[i]=="?") {
					blank=0;			
				}
				else if(b[i]!=a[i]) {
					incorrect++;
				}
			}
			
		}
		return correct-incorrect;
	}

}
