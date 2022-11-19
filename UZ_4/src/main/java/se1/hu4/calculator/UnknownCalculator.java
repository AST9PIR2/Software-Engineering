package se1.hu4.calculator;


//import org.graalvm.compiler.hotspot.stubs.DivisionByZeroExceptionStub;

public class UnknownCalculator {
	
	private boolean on;

	public UnknownCalculator() {
		on= false;
	}

	/**
	 * Switch calculator on
	 * @throws IllegalStateException
	 */
	public void switchOn() throws IllegalStateException {
		if(!isOn()){
			on= true;
		} else {
			throw new IllegalStateException("Calculator is not off!");
		}
		System.out.println("*Calculator on*");
	}


	/**
	 * Switch calculator off
	 * @throws IllegalStateException
	 */
	public void switchOff() throws IllegalStateException {
		if(isOn()){
			on= false;
		} else {
			throw new IllegalStateException("Calculator is not on!");
		}
		System.out.println("*Calculator off*");
	}

	/**
	 * Query calculator state
	 * @return true if calculator is on, else false
	 */
	public boolean isOn() {
		return on;
	}

	/**
	 * Perform mathematical operation on two arguments and return result
	 * @param x First argument, real number as string, valid range: -1000 <= x <= 1000
	 * @param y Second argument, real number as string, valid range: -1000 <= x <= 1000
	 * @param op Operator, valid operators: '+','-','*','/'
	 * @return x op y
	 * @throws IllegalStateException In case of this method being used in an illegal calculator state
	 * @throws IllegalArgumentException In case of illegal arguments x, y
	 * @throws ArithmeticException In case of an arithmetic exception, i.e. division by zero
	 */
	public double calc(String x, String y, char op) throws IllegalArgumentException, IllegalStateException, ArithmeticException
	{
		if (!isOn()) {
			throw new IllegalStateException("Calculator is not on!");
		}
		double a;
		double b;

		try{
			a= Double.parseDouble(x);
		} catch (NumberFormatException e){
			throw new IllegalArgumentException("Invalid argument x, it is a string!");
		}
		try{
			b= Double.parseDouble(y);
		} catch (NumberFormatException e){
			throw new IllegalArgumentException("Invalid argument y, it is a string!");
		}

		if (a > 1000 || a < -1000){
			throw new IllegalArgumentException("Invalid argument x, out of bounds!");
		}
		if (b > 1000 || b < -1000){
			throw new IllegalArgumentException("Invalid argument y, out of bounds!");
		}

		System.out.println("prased Numbers are: x = " + x + ", y = " + y);

		switch (op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			if (b == 0){
				throw new ArithmeticException("Division by zero!");
			}
			return a/b;
		default:
			throw new IllegalArgumentException("Invalid operator!");
		}		
	}
	
	public static void main(String[] args)
	{
		UnknownCalculator c= new UnknownCalculator();
		try {
			c.switchOn();
			// Beispielrechnung
			System.out.println( c.calc("2", "0", '/') );
			c.switchOff();
		}
		catch (IllegalStateException ise)
			{ System.out.println("Calculator State Error: " + ise.getMessage()); }
		catch (IllegalArgumentException iae)
			{ System.out.println("Calculator Argument Error: " + iae.getMessage()); }
		catch (ArithmeticException ae)
			{ System.out.println("Calculator Arithmetic Error: " + ae.getMessage()); }
	}
}
