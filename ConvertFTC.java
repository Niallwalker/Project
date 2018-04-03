import java.util.Scanner;
	public class ConvertFTC{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double Celsius;
	double Fahrenheit;

	System.out.print("Enter temp:");
	Fahrenheit = input.nextDouble();

	Celsius = 5.0 / 9.0 * (Fahrenheit - 32);

		System.out.println();
		System.out.printf(Fahrenheit+"\nFahrenheit is "+Celsius+" Celsius");
		System.out.println();
		Convert.main(null);
	}
}