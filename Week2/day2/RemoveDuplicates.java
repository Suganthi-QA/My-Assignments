package Week2.day2;
/*Remove the duplicate words from a String with the input:
String text = “We learn Java basics as part of java sessions in java week1”;
Expected output: “We learn Java basics as part of sessions in week1”
Assignment Requirements:
- Initialize a variable ‘count’ to keep track of the number of duplicate words found
- Split the text into an array of words using space as the delimiter
- Create two nested for loops to compare each word with every other word in the String array.
- If a duplicate word is found, it is replaced with an empty string and the count is incremented.
- After comparing all words, if the count is greater than 1 (indicating at least one duplicate was found), it prints
the modified words array where duplicates have been replaced with empty strings*/
public class RemoveDuplicates {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn Java basics as part of java sessions in java week1";
		String [] sentence=text.split("\\s+");;
		int count=0,i,j;
		//System.out.println(sentence.length);
		for( i=0;i<=sentence.length-1;i++)
		{
			
			for(j=i+1;j<=sentence.length-1;j++)
			{
			
				if(sentence[i].equalsIgnoreCase(sentence[j]))
				{
					
					sentence[j]= " ";
					count++;	
					}
				
				
			
		}
			
			
		
		//System.out.println(count);
		/*if(count>0)
		   {
			 for(String k:sentence)
				 if(!k.isEmpty())
				 {
			      System.out.print(k+" ");
				 }
		   }*/
		
	}
		if(count>0)
		{
			for(int k=0;k<=sentence.length-1;k++)
			{
			 System.out.print(""+sentence[k] + " ");
		    }
	    }

	}
}
