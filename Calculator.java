package week1.day2;

public class Calculator {
	
	public double add(int a, int b)
	{
		double sum = a+b;
		return sum;		
	}
	
	public double differnce(double a, double b)
	{
		double diff = a-b;
		return diff;
				
	}
	public double prod(double a, double b)
	{
		double prod = a*b;
		return prod;
				
	}
	
	public double div(double a, double b)
	{
		double div = a/b;
		return div;
				
	}
public static void main(String[] args) {
	
	Calculator calc = new Calculator();
	double add1 = calc.add(10,200);
	System.out.println("Addition: " + add1);
	double diff1 = calc.differnce(20, 10);
	System.out.println("Difference: " + diff1);
	double prod1 = calc.prod(20, 10);
	System.out.println("Product: " + prod1);
	double div1 =  calc.div(10,20);
	System.out.println("Division: " + div1);
}
}
