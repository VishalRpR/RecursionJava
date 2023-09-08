import java.util.*;
public class displayReverseArray {

	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr =new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		reverseArray(arr,arr.length-1);
		
	}
	
	public static void reverseArray(int[] arr, int idx ) {
		if(idx<0) {
			return;
		}
		System.out.println(arr[idx]);
		reverseArray(arr,idx-1);
	}
}
