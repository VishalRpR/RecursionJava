import java.util.*;
public class introArrayList {

	public static void main(String[] args) {
//		ArrayList<Integer> List=new ArrayList<>();
//		List.add(10);
//		List.add(23);
//		System.out.println(List+"->"+List.size());
//		
//		for(int val:List) {
//			System.out.println(val);
//		}
		
		
//		String str = "hello";
//		System.out.println(str);
////		char ch =str.charAt(0);
//             for (int i = 0; i < str.length(); i++) {
//				char ch = str.charAt(i);
//				System.out.println(ch);
//			}
		
		
		ArrayList<Integer> List=new ArrayList<>();
		List.add(10);
		List.add(20);
		for (int i = 0; i < List.size(); i++) {
			int val = List.get(i);
			System.out.println(val);
		}
		
		
		List.set(0,50);
		System.out.println(List);

		List.add(0,500);
		System.out.println(List);		
		
		
		
	}

}
