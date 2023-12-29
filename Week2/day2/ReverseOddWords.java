package Week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the string variable
		//Assign a value to a variabe
		String Sentence="I am software tester";
		String[] resultwords=Sentence.split("\\s+");
		for(int i=0;i<=resultwords.length-1;i++)
		{
			
			if(i%2!=0)
			{
				//System.out.println(+i+"Odd index"+resultwords[i]);
				char[] reverseword=resultwords[i].toCharArray();
				for (int j=reverseword.length-1;j>=0;j--)
				{
					//reverese the string
					//System.out.println(+j);
					System.out.print(""+reverseword[j]);
				

				}
			}
			else
			{
				System.out.print(""+resultwords[i]+" ");
			}
		}
		
		

	}

	

}
