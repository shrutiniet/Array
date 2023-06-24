package Sorting;
import java.util.*;
public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Selection(arr);

	}
public static void Selection(int []arr)
{
	for(int i=0;i<arr.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[min])
				min=j;
		}
		int tmp=arr[i];
		arr[i]=arr[min];
		arr[min]=tmp;
	}
	System.out.println("\nSorted array: ");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
}
}
