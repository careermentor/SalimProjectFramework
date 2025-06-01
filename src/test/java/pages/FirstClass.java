package testPkg;

public class FirstClass 
{
	
	
	public void printValues()
	{
		int a = 10;
		float b = 10.5f;

		char c = 'X';
		
		String name = "java";
		
		boolean d = false;
		
		
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(name);
		
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		FirstClass fc = new FirstClass();
		fc.printValues();
		
	}
	
}
