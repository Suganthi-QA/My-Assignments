package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]={},temp;
		Integer a[]= {3,2,11,4,6,7};
		List<Integer> avalue=new ArrayList<Integer>();
		avalue.addAll(Arrays.asList(a));
		Collections.sort(avalue);
		System.out.println("Print the number"+avalue);
		System.out.println("Second largest number is "+ avalue.get(avalue.size()-2));
		
	}

}
