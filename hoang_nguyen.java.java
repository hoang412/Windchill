import java.util.Scanner;

public class hoang_nguyen {
	public static void main (String arg[]) {
		Scanner input = new Scanner(System.in);
		double winchill;
		System.out.println("Wind Chill Calculator!!");
		System.out.print("Enter the temperature in Fahrenheit");
		System.out.print(" (must be >= -45 and <= 40): ");
		
		double temp = input.nextDouble();
		
		System.out.print("Enter the win speed (must be >=5 and <=60): ");
		double speed = input.nextDouble();
		
		winchill = 35.74 + (0.6215*temp) - 35.75*(Math.pow(speed, 0.16)) + ((0.4275*temp)*(Math.pow(speed, 0.16)));
		
		System.out.println("The winchill temperature: "+ winchill + " degrees Fahrenheit");
		
		System.out.println("Programmer: Hoang Nguyen");
		
	}
}