package Week2.day1;

public class PrimeNumber {
	int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber pm=new PrimeNumber();
		pm.IsPrime(2);
		//pm.IsPrime(4);

	}
	
	public void IsPrime(int n)
	{
		
		for(int i=2;i<=n/2;i++)
		{
		
		if((n%i)==0)
		{
			count++;
			
		}
		}
		if (count > 1) {
	        System.out.println("The number is not prime");
	    }
	    else {
	      System.out.println("The number is prime");
	    }
		
	}

}
