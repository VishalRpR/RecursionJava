import java.util.*;
public class displayArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=scn.nextInt();
		}
 
		displayArray(arr1,0);
	}
	 
	public static void displayArray(int[] arr,int idx) {
		if(arr.length==idx) {
			return;
		}
		System.out.println(arr[idx]);
		displayArray(arr,idx+1);
	
	}

}
