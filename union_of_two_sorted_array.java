package array_questions;
import java.util.*;
public class union_of_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();		
		int[] arr1=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int[] arr2=new int[n];		
		for(int j=0;j<n;j++)
		{
			arr2[j]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();		
		for(int i=0;i<m;i++)
		{
			set.add(arr1[i]);
		}
		for(int j=0;j<n;j++)
		{
			set.add(arr2[j]);
		}
		ArrayList<Integer> AL=new ArrayList<>();
		for(int s:set)
		{
			AL.add(s);
		}
		for(int x:AL)
		{
			System.out.print(x+"  ");
		}
	}

}
