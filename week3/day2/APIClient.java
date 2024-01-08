package week3.day2;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("Api Client Request endpoint"+endpoint);
	}
	public void sendRequest(String endpoint,String requestbody,Boolean requestStatus)
	{
		System.out.println("Function endpoint is ---->"+endpoint);
		System.out.println("Function endpoint is ---->"+requestbody);
		System.out.println("Function passed staus is (y/N)"+requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         APIClient myApi=new APIClient();
         myApi.sendRequest("DF324234234");
         myApi.sendRequest("WE3432","Welcome to testleaf",true);
	}

}
