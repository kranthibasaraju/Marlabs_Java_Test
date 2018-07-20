//Question 2 - Finding mean , median and mode

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

//file contains numbers using seperator  " "
public class Statistician {
	public static void main(String args[]) {
		
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter file path with / seperator");
	String pathname=scanner.next();
	File file = new File(pathname);
	List<Integer> list = new ArrayList<Integer>();
	//File file = new File("file.txt");
	BufferedReader reader = null;

	try {
	    reader = new BufferedReader(new FileReader(file));
	    String text = reader.readLine();
	    String[] numbers = text.split("\\s");
	    for(String s:numbers)
	    	list.add(Integer.parseInt(s));
	    
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    try {
	        if (reader != null) {
	            reader.close();
	        }
	    } catch (IOException e) {
	    }
	}
	System.out.println("Listed numbers are"+list);
	System.out.println("Enter \n1 - Mean\n2 - Median\n3 - Mode");
	int key=scanner.nextInt();
	switch (key) {
	case 1:
		System.out.println("mean is "+CalculateMean(list));
		break;
	case 2:
		System.out.println("Median is "+CalculateMedian(list));
		break;
	case 3:
		System.out.println("Mode is "+CalculateMode(list));
	default:
		break;
	}
	
	}
	
	private static int CalculateMode(List<Integer> list) 
	{
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		
		});
		int count2 = 0;
	    int count1 = 0;
	    int rep1 =0;
	    int rep2 =0;


	    for (int i = 0; i < list.size(); i++)
	    {
	            rep1 =list.get(i);
	            count1 = 0;    //see edit

	        for (int j = i + 1; j < list.size(); j++)
	        {
	            if (rep1 == list.get(j)) count1++;
	        }

	        if (count1 > count2)
	        {
	                rep2 = rep1;
	                count2 = count1;
	        }

	        else if(count1 == count2)
	        {
	            rep2 = Math.min(rep2, rep1);
	        }
	    }

	    return rep2;

	}

	private static int CalculateMedian(List<Integer> list) 
	{
		int median=0;
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		
		});
		
		return list.get(list.size()/2);
	}

	public static int CalculateMean(List<Integer> list) 
	{
		int mean=0;
		for(int i=0;i<list.size();i++)
		{
			mean=mean+list.get(i);	
		}
		mean=mean/list.size();
		return mean;
	}
	
}
