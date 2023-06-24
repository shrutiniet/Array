package Sorting;
import java.util.*;
public class Merge_sorting {

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
		Divide(arr,0,arr.length-1);
		System.out.println("\nSorted array: ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
public static void Divide(int[]arr, int low, int high)
{
	if(low==high)
		return;
	int mid=(low+high)/2;
	Divide(arr,0,mid);
	Divide(arr,mid+1,high);
	Merge(arr,low,mid,high);
}
public static void Merge(int[]arr, int low, int mid, int high)
{
	int [] tmp=new int[high+1];
	int k=0;
	int i=low;
	int j=mid+1;
	while(i<=mid && j<=high)
	{
		if(arr[i]<arr[j])
		{
			tmp[k]=arr[i];
			k++;
			i++;
		}
		else
		{
			tmp[k]=arr[j];
			j++;
			k++;
		}
	}
	while(i<=mid)
	{
		tmp[k]=arr[i];
		i++;
		k++;
	}
	while(j<=high)
	{
		tmp[k]=arr[j];
		j++;
		k++;
	}
	for(int l=low;l<=high;l++)
	{
		arr[l]=tmp[l-low];
	}
}
}
