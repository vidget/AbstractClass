
public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		
		cam1.setId(5);
		
		Car car1 = new Car();
		
		car1.setId(6);

		
		//Doesn't work because the Machine Class is abstract
		//a Machine object can't be created, only extended.
		//Machine mach1 = new Machine();
		
		
		cam1.run();
		car1.run();
		
		
	}

}
