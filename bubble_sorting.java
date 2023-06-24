package Sorting;
import java.util.*;
public class bubble_sorting {

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
		Bubble(arr);

	}
public static void Bubble(int[]arr)
{
	int n=arr.length;
	for(int i=0;i<n-2;i++)
	{
		int didswap=0;
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j+1]<arr[j])
			{
				int tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
				didswap++;
			}
		}
		if(didswap==0)
			break;
	}
	System.out.println("\nSorted array: ");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
}
}
