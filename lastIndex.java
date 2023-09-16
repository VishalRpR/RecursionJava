import java.util.*;
public class lastIndex {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int x=scn.nextInt();
		int li=lastIndexx(arr,0,x);
		System.out.println(li);

	}
	
	public static int lastIndexx(int[] arr, int idx, int x) {
		
		if(idx==arr.length-1) {
			return idx;
		}
		int lili=lastIndexx(arr,idx+1,x);
		if(lili==-1) {
			if(arr[idx]==x) {
				return idx;
			}else {
				return -1;
			}
		}else{
			return lili;
		}
		
		
		
		

	}

}
