package week3.day3;

public  class ConcreateClass implements DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConcreateClass connection=new ConcreateClass();
       connection.connect();
       connection.disconnect();
       connection.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Database Connected ");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Database DisConnected ");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Database Updated ");
	}

}
