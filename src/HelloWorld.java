
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello");
		HelloWorld obj = new HelloWorld();
		obj.doSomeThing();
		
		
	}
	
	void doSomeThing(){
		System.out.println("Calling doSomeThing method");
	}

}
