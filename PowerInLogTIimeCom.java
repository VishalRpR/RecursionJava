import java.util.*;
public class PowerInLogTIimeCom {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int x= scn.nextInt();
	int n =scn.nextInt();
	int xn=power(x,n);
	System.out.println(xn);
	

	}
	
	public static int power(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		
		int xbn=power(x,n/2);
		int finlbn=xbn*xbn;
		
		if(n%2==1){
		finlbn=finlbn*x;
			
			
		}
		
    
		return finlbn;
		
		
	}

}
