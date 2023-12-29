package Week2.day1;

public class Palindrome {
	  int InputNumber =121;
	   int Output;
	   int remainder,sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome RN=new Palindrome();
		RN.reverseNumber();
      
	}
   public void reverseNumber()
   {
	 
	   for (int i=InputNumber;i>0;i/=10)
	   {
		   Output=i%10;//getting remainder
		   //System.out.println(InputNumber);
		   //System.out.println(Output);
		   //System.out.print(remainder);
		   remainder=Output;
			System.out.println("sum is"+(sum*10)); 
			sum=(sum*10)+Output;  
			//i=i/10;
	   }
	   
	   if (InputNumber==sum)
	   {
		   System.out.println("The number is palindrome");
	   }
   }
}
