package Week2.day2;

public class StringReverse {
	
public static void main(String[] args) {
	String companyName="TestLeaf";
	char[] reverse=companyName.toCharArray();
	//char[] reversedvalue;
	System.out.println("Reveresed string is:");
	for (int i=reverse.length-1;i>=0;i--)
	{
		//reversedvalue=reverse[i];
		System.out.print(""+reverse[i]);

	}
	
}
}
