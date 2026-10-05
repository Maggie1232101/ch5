
import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber{
	public static boolean test(int n, int mn){
		if(n==mn){
			System.out.println("You guessed it yayayayay!!");
			return true;
		}
		else if(n>mn){
			System.out.println("Try guessing lower!");
			return false;
		}
		else{
			System.out.println("Try guessing higher!");
			return false;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		Random random = new Random();
		int myNum = random.nextInt(100) + 1;
		
		System.out.println("I'm thinking of a number between 1 and 100! Can you guess it?");
		
		int yourNum = in.nextInt();
		
		boolean yeaNah = test(yourNum, myNum);
		if(!yeaNah){
			yourNum = in.nextInt();
		}
		yeaNah = test(yourNum, myNum);
		if(!yeaNah){
			yourNum = in.nextInt();
		}
		yeaNah = test(yourNum, myNum);
		if(!yeaNah){
			yourNum = in.nextInt();
		}
	}
}
