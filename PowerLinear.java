import java.util.*;
public class PowerLinear {

	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    int n= scn.nextInt();
	    int x= scn.nextInt();
	    int p=power(n,x);
	    System.out.println(p);
	    

	}
	
	public static int power(int n, int x) {
		if(x==0) {
			return 1;
		}
		
		int mulp=power(n, x-1);
		int clc=n*mulp;
		return clc;
		
	}

}
