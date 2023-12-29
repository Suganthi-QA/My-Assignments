package Week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxrange=10;
		System.out.println("Print odd numbers from 1 to 10");
		System.out.println("******************************");
		for (int i=1;i<=maxrange;i++)
		{
			if((i%2)==1)
			{
				System.out.println("The number is : " + i + "  Its a odd number");
			}
		}

	}

}
