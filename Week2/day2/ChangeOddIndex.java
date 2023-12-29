package Week2.day2;
/*Change the odd index of a given String to uppercase with the input : String test = “changeme”;
Requirements:
- Convert the given String to a character array.
- Implement a loop to iterate through each character of the String (from end to start).
- Find the odd index within the loop
- Inside the loop, change the character to uppercase only if the index is odd
- Print the characters with the expected output: cHaNgEmE*/
public class ChangeOddIndex {
	
	public static void main(String[] args) {
		ChangeOddIndex oddindex=new ChangeOddIndex();
		oddindex.uppercase();
		
	}
	public void uppercase()
	{
		   String name="changeme";
		   char[] index=name.toCharArray();
		   for(int i=0;i<=index.length-1;i++)
		   {
			   if(i%2!=0)
			   {
				   System.out.print(""+Character.toUpperCase(index[i]));
				   
				   //char ch=Character.toUpperCase(index[i]);
			   }
			   else
			   {
				   System.out.print(""+index[i]);
			   }
		   }

	}
}

