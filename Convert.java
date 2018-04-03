import java.util.Scanner;
	public class Convert{
 	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Fahrenheit to Celsius");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.println("3. Exit");


    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Fahrenheit to Celsius");
        System.out.println();
        ConvertFTC.main(null);
        break;
      case 2:
        System.out.println("Celsius to Fahrenheit");
        System.out.println();
        ConvertCTF.main(null);
        break;
        case 3:
		System.out.println("Exiting....");
        break;
	}
	Index.main(null);
	}
}