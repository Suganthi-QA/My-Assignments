package Week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="google";
      char text[]=name.toCharArray();
      Set<Character> textname=new LinkedHashSet<Character>();
      
      System.out.println(""+name);
      for(int i=0;i<text.length;i++)
      {
    	  textname.add(text[i]);
    	  
      }
      System.out.println(""+textname );
	}

}