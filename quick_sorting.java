package Sorting;
import java.util.*;
public class quick_sorting {


		// TODO Auto-generated method stub
		public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted array: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		Quick(arr,0,arr.length-1);
		System.out.println("\nSorted array: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
public static void Quick(int[]arr, int low, int high)
{
	if(low<high)
	{
		int p_index=Function(arr,low,high);
		Quick(arr,low,p_index-1);
		Quick(arr,p_index+1,high);
	}
}
public static int Function(int[]arr, int low, int high)
{
	int pivot=low;
	int i=low;
	int j=high;
	while(i<j)
	{
		while(arr[i]<arr[pivot] && i<=high)
		{
			i++;
		}
		while(arr[j]>arr[pivot] && j>=low)
		{
			j--;
		}
		if(i<j)
		{
			Swap(arr,i,j);
		}
	}
	Swap(arr,low,j);
	return j;
}
public static void Swap(int[]arr, int i, int j)
{
	int tmp=arr[i];
	arr[i]=arr[j];
	arr[j]=tmp;
}
}
