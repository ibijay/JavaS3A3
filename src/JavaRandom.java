import java.util.Random;
import java.util.Scanner;

public class JavaRandom {

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int min,max;
		Random rand = new Random();

		try{
			System.out.println("Enter Min and Max value for Random Generation:");
			min = input.nextInt();
			max = input.nextInt();
			int randnum = rand.nextInt((max-min)+1)+min;
			System.out.println("Random Number Between " + min + " and " + max + " is " + randnum);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Something went wrong "+e);
		}
	}
}