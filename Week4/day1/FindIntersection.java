package Week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {3,2,11,4,6,7};
		Integer b[]= {1,2,8,4,9,7};
		List<Integer> avalue=new ArrayList<Integer>();
		avalue.addAll(Arrays.asList(a));
		System.out.println(avalue);
		List<Integer> bvalue=new ArrayList<Integer>();
		bvalue.addAll(Arrays.asList(b));
		for(Integer i=1;i<avalue.size();i++)
		{
			
				if(avalue.get(i)==bvalue.get(i))
				{
					System.out.println("Intersection values are:" +avalue.get(i));
				}
			
		}
		
		

	}

}
