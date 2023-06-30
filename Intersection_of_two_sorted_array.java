package array_questions;
import java.util.*;
public class Intersection_of_two_sorted_array {

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
		int i=0;
		int j=0;
		ArrayList<Integer> AL=new ArrayList<>();
		while(i<m && j<n)
		{
			if(arr1[i]<arr2[j])
			{
				i++;
			}
			else if(arr1[i]>arr2[j])
			{
				j++;
			}
			else
			{
				AL.add(arr1[i]);
				i++;
				j++;
			}
		}
		for(int x: AL)
		{
			System.out.print(x+" ");
		}

	}

}
