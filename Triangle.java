import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type your 3 sides of the triangle, one then enter, then another and enter!");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a+b<c||b+c<a||c+a<b){
			System.out.println("no triangle can be made with these values :-(");
		}
		else{
			System.out.println("Yay you made a triangle with teh sides " + a + b + c + "X-D");
		}
	
	}

}
