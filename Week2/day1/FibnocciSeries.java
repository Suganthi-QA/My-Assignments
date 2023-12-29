package Week2.day1;

public class FibnocciSeries {
	int a=0,b=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     FibnocciSeries FS =new FibnocciSeries();
      FS.SeriesCalculation();
		
	      
	}
public void SeriesCalculation()
{
	
	for (int i=1;i<=8;++i)
	{
		//System.out.println(i);
		System.out.print(a + ", ");
		int c=a+b;
		a=b;
		b=c;
		
	}	
	
}
}

