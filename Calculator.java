package week1.day2;

public class Calculator {
	
	int x = 50;
	int y = 30;
	int z = 10;

	public void add(int x,int y,int z) {
		int a = x+y+z;
	System.out.println("Sum of a is " + a );
	}
	
	public void sub(int x, int y) {
		int a = x -y;
		System.out.println("Subtraction of x and y: " + a);
		
	}
	public void mul(int x, int y) {
		int a = x*y;
		System.out.println("Multiple of x and y: " + a);
		
	}
	public void Div(int x, int y) {
		int a = x/y;
		System.out.println("Division of x and y: " + a);
			
	}
	
	public static void main(String[] args) {
		Calculator calobj = new Calculator();
		calobj.add(50, 30, 10);
		calobj.sub(50, 30);
		calobj.mul(50, 30);
		calobj.Div(50, 30);
		
		
	}
	
	
	
}
