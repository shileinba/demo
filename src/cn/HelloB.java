package cn;

public class HelloB extends HelloA{
	public HelloB(){
		System.out.println("HelloB");
	}
	
	{
		System.out.println("I am  b class");
	}
	static{
		System.out.println("static b");
	}
	
	public static void main(String[] args) {
		new HelloB();
		new HelloA();
	}
}
