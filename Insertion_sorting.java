package Sorting;
import java.util.*;
public class Insertion_sorting {
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
		Insertion(arr);

}
public static void Insertion(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
	int j=i;
	while(j>0 && arr[j-1]>arr[j])
	{
		int tmp=arr[j-1];
		arr[j-1]=arr[j];
		arr[j]=tmp;
		j--;
	}
}
System.out.println("\nSorted array: ");
for(int x:arr)
{
	System.out.print(x+" ");
}
}
}
