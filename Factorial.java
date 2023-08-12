import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int f=facto(n);
		System.out.println(f);
		

	}
	
	public static int facto(int n) {
		if(n==1) {
			return 1; 
		}
		int fnmr=facto(n-1);
		int fn=n*fnmr;
		return fn;
	}

}
