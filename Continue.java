// for project - menu choice will invoke another class
import java.util.Scanner;

public class Continue{
  	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
   		int counter = 0;
    	int x = 0;

		System.out.println("Pick a number between 1 and 10: ");
		x = input.nextInt();

    	while(counter < 10){
			counter++;
			if(x == counter){
			 continue;
    	}
		System.out.println(counter);
	}
  }
}