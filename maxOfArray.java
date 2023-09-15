import java.util.*;
public class maxOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int mxmxmx=maxArray(arr,arr.length-1);
		System.out.println(mxmxmx);
		

	}
	
	public static int maxArray(int[] arr,int idx) {
		
		if(idx==0) {
			return arr[0];
		}
		
	
		int max=maxArray(arr,idx-1);
		
		if(max>arr[idx]) {
			return max;
		}else {
			return arr[idx];
		}
		
		
		
		
	}

}
