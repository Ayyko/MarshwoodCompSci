import java.util.Scanner;



public class AverageProgram
{
    public static void main (String[] args)
    {
    	int x = 0;
    	int min = 1000000;
    	int max = 0;
    	int sum = 0;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("How many test scores do you have?");
    	while (!scanner.hasNextInt()) {
			   System.out.println("Please input an integer only!");
			   scanner.nextLine();
			}
    	int numberOfScores = scanner.nextInt();
    	System.out.println("Please enter each test score followed by a carrage return:");
		while ( x < numberOfScores) {
			while (!scanner.hasNextInt()) {
				   System.out.println("Please input an integer only!");
				   scanner.nextLine();
				}
			int input = scanner.nextInt();
				if (input > max) {
				max = input;
				}
				if (input < min) {
					min = input;
				}
			sum += input;
			x += 1;
			scanner.nextLine();
			} 
		scanner.close();
		System.out.println("The mean of the test scores is: " + (sum / numberOfScores) + ". The higest score was: " + max + ". The lowest was: " + min + ".");
    }
}