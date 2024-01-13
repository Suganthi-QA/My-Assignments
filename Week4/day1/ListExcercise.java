package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> companyname=new ArrayList<String>();
        companyname.add("HCL");
        companyname.add("Wipro");
        companyname.add("Aspire Systems");
        companyname.add("CTS");
        Collections.sort(companyname);
        System.out.println(companyname);
        System.out.println("Reverse the given collection of String elements");
        System.out.println("*************************************************");
        for(int i=companyname.size()-1;i>=0;i--)
        {
        	System.out.println(companyname.get(i));
        }
	}

}
