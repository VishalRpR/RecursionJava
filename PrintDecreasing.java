import java.util.Scanner;

public class PrintDecreasing {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		decreaser(n);
		

	}
	
	public static void decreaser(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		decreaser(n-1);
		
	}

}
