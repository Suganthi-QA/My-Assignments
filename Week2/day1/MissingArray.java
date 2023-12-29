package Week2.day1;

import java.util.Arrays;

public class MissingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MissingArray Mr=new MissingArray();
      Mr.missingone();
	}
 public void missingone()
 {
	 int [] a= {1,2,3,4,6,7};
	 Arrays.sort(a);
	 for(int i=0;i<a.length;i++)
	 {
		if((a[i]!=i+1))
		{
			System.out.println("Missing number is :"+(i+1));
			break;
		}
	 }
	 
 }
}
