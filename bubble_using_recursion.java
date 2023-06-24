package Sorting;
import java.util.Scanner;
public class bubble_using_recursion {
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
		Bubble(arr,0);
		System.out.println("\nSorted array: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
public static void Bubble(int[]arr,int idx)
{
	if(idx>arr.length-1)
	{
		return;
	}
	for(int i=0;i<arr.length-1-idx;i++)
	{
		if(arr[i]>arr[i+1])
		{
			int tmp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tmp;
		}
	}
	Bubble(arr,idx+1);
}
}
