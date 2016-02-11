
public abstract class Machine {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//an abstract method.
	
	//forces the objects that extend the Machine class to
	// make the equivelant method. Similar to using an 
	//Interface
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	
	
	public void run(){
		
		start();
		doStuff();
		shutdown();
		
	}
	
	
}
