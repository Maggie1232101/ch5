import java.util.Scanner;

public class quadratic{
	public static void main(String[] args){
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input your numbers for a b and c  for the quadratic formula!");
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		double ans1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
		double ans2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
		
		System.out.println("Your roots are " + ans1 + " and " + ans2 + " NaN means your root does not exist!");
	
	}

}
