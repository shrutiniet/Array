package array_questions;
import java.util.*;
public class largest_ele_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("Max ele in array is : "+arr[arr.length-1]);

	}

}
