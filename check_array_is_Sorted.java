package array_questions;
import java.util.*;
public class check_array_is_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean ans=isSorted(arr);   //method1  not rotational case :-- Complexity : O(n)
		//boolean ans=isSorted1(arr); // method 2 in the case of rotational array 
		if(ans==true)
			System.out.println("Sorted");
		else
			System.out.println("Not Sorted");
	}
public static boolean isSorted(int[] arr)
{
	int i=0;
	while(i<arr.length-1)
	{
		if(arr[i]>arr[i+1])
			return false;
		i++;
	}
	return true;
}
//public static boolean isSorted1(int[]arr)
//{
//	int idx=0;
//	int min=arr[0];
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i]<min)
//		{
//			min=arr[i];
//			idx=i;
//		}
//	}
//	int j=idx+1;
//	//if(j>)
	
}

