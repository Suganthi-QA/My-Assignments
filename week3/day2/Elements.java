package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Elements Em=new Elements();
       Em.Click();
       Em.SetText("Welcome");
       Em.submit();
       System.out.println("Text Field Subclasses inheritance");
       Textfield tx=new Textfield();
       tx.gettext();
       System.out.println("Radio button Subclasses inheritance");
       RadioButton rd=new RadioButton();
       rd.selectRadioButton();
       rd.submit();
       System.out.println("Checkbox button Subclasses inheritance");
       CheckBox ck=new CheckBox();
		ck.clickCheckButton();
		ck.submit();
       
	}

}
