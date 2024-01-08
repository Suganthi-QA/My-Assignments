package week3.day3;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           JavaConnection connection=new JavaConnection();
           connection.connect();
           connection.disconnect();
           connection.executeUpdate();
           connection.executeQuery();
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
		System.out.println("Database Updated");
	}

}
