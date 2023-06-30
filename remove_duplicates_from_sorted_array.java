package array_questions;
import java.util.*;
public class remove_duplicates_from_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=removeDuplicates(arr);
		System.out.println("Array after removing duplicates: ");
		for(int i=0;i<k;i++)
			System.out.print(arr[i]+" ");

	}
public static int removeDuplicates(int[]arr)
{
	
	HashSet<Integer> set=new HashSet<>();
	for(int i=0;i<arr.length;i++)
	{
		set.add(arr[i]);
	}
	int k=set.size();
	int i=0;
	for(int x:set)
	{
		arr[i]=x;
		i++;
	}
	return k;
}
}
