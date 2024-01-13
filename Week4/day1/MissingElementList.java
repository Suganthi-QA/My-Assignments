package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> number=new ArrayList<Integer>();
     number.add(1);
     number.add(2);
     number.add(3);
     number.add(4);
     number.add(10);
     number.add(6);
     number.add(8);
     Collections.sort(number);
     System.out.println(number);
     for(int i=0;i<number.size()-1;i++)
     {
    	 int currentnumber=number.get(i)+1;
    	 int nextnumber=number.get(i+1);
    	 //System.out.println("First Number:"+currentnumber);
		 //System.out.println("Second number:"+nextnumber);
    	 if(currentnumber!=nextnumber)
    	 {
    		 System.out.println("Missing Number is :"+currentnumber);
    		 //System.out.println("First Number:"+currentnumber);
    		// System.out.println("Second number:"+nextnumber);
    	 }
    	 else
    	 {
    		 //System.out.println("No missing number");
    	 }
     }
     
	}

}
