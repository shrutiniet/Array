// Array must be in sorted order
package Searching;
import java.util.*;
public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter value=");
		int val=sc.nextInt();
		int found=B_Search(arr,val);
		if(found==-1)
			System.out.println("Value not exist in array");
		else
			System.out.println("Value found at index= "+found);
	}
public static int B_Search(int[]arr, int val)
{
	int low=0;
	int high=arr.length-1;
	int mid=0;
	while(low<high)
	{
		mid=low+(high-low)/2;
		if(arr[mid]==val)
			return mid;
		else if(arr[mid]>val)
			high=mid+1;
		else
			low=mid-1;
	}
	return mid;
}
}
