package array_questions;
import java.util.*;
public class buy_and_sell_stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Approach1(arr,n);  // works IFF max occur after min  O(2N)
		Approach2(arr,n);  // bruteforce approach  around O(N*N)
		Approach3(arr,n);  //bestone O(n)
	}
public static void Approach1(int[]arr, int n)
{
	int min=Integer.MAX_VALUE;;
	int max=Integer.MIN_VALUE;
	int idx=0;
	int profit=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
			idx=i;
		}
	}
	for(int j=idx+1;j<n;j++)
	{
		if(arr[j]>max && arr[j]>arr[idx])
		{
			max=arr[j];
			profit=Math.max(profit, max-min);
		}
	}
	
	System.out.println("Max profit: "+profit);
}
public static void Approach2(int[]arr, int n)
{
	 int profit=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				profit=Math.max(profit, arr[j]-arr[i]);
			}
		}    
		System.out.println("Max profit: "+profit);
}
public static void Approach3(int[]arr, int n)
{
	int buy=arr[0];
	int profit=0;
	for(int i=1;i<n;i++)
	{
		if(arr[i]<buy)
			buy=arr[i];
		else
		{
			profit=Math.max(profit, arr[i]-buy);
		}
	}
	System.out.println("Max profit: "+profit);
}
}
