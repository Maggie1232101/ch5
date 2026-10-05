import java.util.Scanner;

public class Fermat{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double a,b,c,n;
		
		System.out.print("Type 4 numbers in a row (abcn) to test Fermat! Fermat says n cant be over 2: ");
		double num = in.nextDouble();
		
		a = num/1000;
		b =  num%1000/100;
		c= num%1000%100/10;
		n = num%1000%100%10;
		
		if(Math.pow(a,n)+Math.pow(b,n)== Math.pow(c,n) && n>2){
			System.out.println("HOLY COW FERMAT IS WRONG");
		}
		else{
			System.out.println("No that does not work");
		}
	
	}

}
