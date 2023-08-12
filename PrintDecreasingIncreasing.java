import java.util.*;
public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		DecreIncre(n);
		
	}
	
	public static void DecreIncre(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		DecreIncre(n-1);
		System.out.println(n);
	}

}
