package array_questions;
import java.util.*;
public class union_of_two_sorted_array_2approach {

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
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{				
				set.add(arr1[i]);
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				set.add(arr2[j]);
				j++;
			}
			else
			{
				set.add(arr1[i]);
				i++;
				j++;
			}			
		}
		while(i<m)
		{
			set.add(arr1[i]);
			i++;
		}
		while(j<n)
		{
			set.add(arr2[j]);
			j++;
		}
		for(int x: set)
		{
			System.out.print(x+" ");
		}

	}

}
