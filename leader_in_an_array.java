package array_questions;
import java.util.*;
public class leader_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//Approach1(arr,n);  //O(N*N)
		Approach2(arr,n);   // O(N)
		
	}
public static void Approach1(int[]arr, int n)
{
	ArrayList<Integer> AL=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
		int count=0;
		for(int j=(i+1);j<n;j++)
		{
			if(arr[j]>arr[i])
				count++;
		}
		if(count==0)
			AL.add(arr[i]);
	}
	for(int x:AL)
		System.out.print(x+" ");
}
public static void Approach2(int[]arr, int n)
{
	int max=Integer.MIN_VALUE;
	ArrayList<Integer> AL=new ArrayList<>();
	for(int i=n-1;i>=0;i--)
	{
		if(arr[i]>max)
		{
			AL.add(arr[i]);
			max=arr[i];
		}
	}
	for(int i=AL.size()-1;i>=0;i--)
	{
		System.out.println(AL.get(i));
	}
}
}
