import java.util.Scanner;
	public class ConvertCTF{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double Celsius;
	double Fahrenheit;

	System.out.print("Enter temp:");
	Celsius = input.nextDouble();

	Fahrenheit = 9.0 / 5.0 * (Celsius + 32);

		System.out.println();
		System.out.printf(Fahrenheit+"\nCelsius is "+Fahrenheit+" Fahrenheit");
		System.out.println();
		Convert.main(null);
	}
}