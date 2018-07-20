//Question - 3
import java.io.File;

public class ArraySeq {

	
	public static boolean CheckSeq(int[] a) {
		if(a.length<3) {
			System.out.println("Sequence not found");
			System.exit(-1);
		}
		boolean seq=false;
		int first=a[0];
		int second=a[1];
		int third=a[2];
		if(a.length==3)
			if(first==1)
				if(second==2)
					if(third==3)
						seq=true;
		if(a.length>3)
			for(int i=0;i<a.length-2;i++)
				if(a[i]==1)
					if(a[i+1]==2)
						if(a[i+2]==3) {
							seq=true;}
		return seq;
	}

}
