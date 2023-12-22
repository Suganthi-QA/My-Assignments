package Week1.day2;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser Name=new Browser();
		
		String Browsername=Name.launchBrowser("Google Chrome");
		System.out.println(Browsername);
		
		System.out.println("*******************************");
		
		Chrome openbrowser=new Chrome();
		openbrowser.getname();
		openbrowser.printname();

	}
	
	//methods
	public String launchBrowser(String browserName)
	
	{
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
		
	}

}
