package Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();  //
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		//SingleObject object =  new SingleObject(); 
		//show the message
		
		object.showMessage();
		}
}
