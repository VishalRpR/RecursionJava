import java.util.Scanner;

public class PrintIncreasing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		Increaser(n);

	}
	
	public static void Increaser(int n) {
		if(n==0) {
			return;
		}
		Increaser(n-1);
		System.out.println(n);
	}

}
