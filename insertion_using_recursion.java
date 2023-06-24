package Sorting;
import java.util.Scanner;
public class insertion_using_recursion {
	
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
	Insertion(arr,0);
	System.out.println("Sorted array: ");
	for(int x:arr)
	{
		System.out.print(x+" ");
	}
}
public static void Insertion(int[]arr, int idx)
{
	if(idx>=arr.length)
		return;
	int j=idx;
	while(j>0 && arr[j-1]>arr[j])
	{
		int tmp=arr[j-1];
		arr[j-1]=arr[j];
		arr[j]=tmp;
		j--;
	}
	Insertion(arr,idx+1);
}
}