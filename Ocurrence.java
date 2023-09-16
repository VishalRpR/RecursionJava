import java.util.Scanner;

public class Ocurrence {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n =scn.nextInt();
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int d= scn.nextInt();
		int fi=firstIdx(arr,0,d);
		System.out.println(fi);
		
		
		
		

	}
	
	public static int firstIdx(int arr[],int idx,int d) {
		
		if(idx ==arr.length) {
			return -1;
		}
		
		
		if(arr[idx]==d) {
			return idx;
		}else{
			int fiiasa=firstIdx(arr,idx+1,d);
			return fiiasa;
		}
		
		
	}

}
