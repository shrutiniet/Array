package array_questions;
import java.util.*;
public class second_largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Second1(arr);  // 1 approach: here complexity is O(n*n)
			Second2(arr);  // 2 approach: here complexity is O(n)
		

	}
public static void Second1(int[]arr)
{
	for(int i=0;i<arr.length;i++)
	{
		int val=arr[i];
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>val)
				count++;
		}
		if(count==1)
		{
			System.out.println("Second max ele is : "+ arr[i]);
			break;
		}
	}	
}
public static void Second2(int[]arr)
{
	int sec_max=Integer.MIN_VALUE;
	int max=0;
	
	for(int i=0;i<arr.length;i++)
	{
		max=Math.max(max, arr[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		if (arr[i] > sec_max && arr[i] != max)
		{
			sec_max = arr[i];
		}
	}
	System.out.println("second max: "+sec_max);
}
}
