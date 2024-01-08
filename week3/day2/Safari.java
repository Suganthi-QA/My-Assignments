package week3.day2;

public class Safari extends Edge {
	public void readMode()
	 {
		 System.out.println("Read Mode");
	 }
	 public void fullScreenmode()
	 {
		 System.out.println("Full screen mode");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Safari mysafari=new Safari();
		mysafari.openURL();
		mysafari.closeBowser();
		mysafari.openincognito();
		mysafari.clearCache();
		mysafari.takesnap();
		mysafari.clearCache();
		mysafari.readMode();
		mysafari.fullScreenmode();
	}

}
