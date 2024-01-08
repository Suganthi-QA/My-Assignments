package week3.day3;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon mypayments=new Amazon();
		mypayments.recordPaymentDetails();
		mypayments.cardPayments();
		mypayments.cashOnDelivery();
		mypayments.upiPayments();
		mypayments.InternetBanking();
		
	}

	@Override
	public void cashOnDelivery() {
		System.out.println("Amazon cash on delivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("Amazon UPI paymnets");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Amazon Card paymnets");
		
	}

	@Override
	public void InternetBanking() {
		System.out.println("Amazon InternetBanking paymnets");
		
	}

}
