
enum Mountains{
		MERIDIONALI,OCCIDENTALI,ORIENTALI;
		
	}

public class Client {
	
	private static String name;
	String pack;
	public Client(){
		this.name="MyPackage";
	}
	public Client(String name){ 
		//this.name=name;
		this();
		this.name="ana";
		
	}
	String getName(){
		return this.name;
	}
	
	
	
	public void sendReq(String pack){
		this.pack=pack;
		
		
	}
	

}
