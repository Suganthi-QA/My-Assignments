package Week2.day2;
/*
 * 
 * 
 * 
 * Your task is to count 
 * the occurrences of character ‘e’ in the given String input="TestLeaf"
 * Create a class with a main method.
- Initialize a variable to 0.
- Convert the given String to a character array.
- Use loop to iterate through each character in the array.
- Compare each character with the target character.
- If a match is found, increment the count.
- Finally, print the count*/

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="TestLeaf";
		int count=0;
		char ch='e';
		char [] output=input.toCharArray();
		for(int i=0;i<=output.length-1;i++)
		   {
			if (output[i]==ch)	
			{
				count++;
				
			}
			//System.out.println(""+output[i]);
			}
		System.out.println("Number of occurence of e is:"+count);
		}

	}


