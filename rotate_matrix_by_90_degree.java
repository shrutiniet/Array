package array_questions;
import java.util.*;
public class rotate_matrix_by_90_degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][]arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		}
		//Approach1(arr,m,n);   // using another matrix
		Approach2(arr,m,n); // firstly transpose the matrix then reverse every row
	}
public static void Approach1(int[][] arr, int m, int n)
{
	int[][] ans=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			
			ans[j][(m-1)-i]=arr[i][j];
		}
	}
	System.out.println("After Rotation");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(ans[i][j]);
		}
		System.out.println();
	}
}
public static void Approach2(int[][]arr, int m,int n)
{
	for(int i=0;i<m-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			int tmp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=tmp;
		}
	}
	for(int i=0;i<m;i++)
	{
		int start=0;
		int end=arr[0].length-1;
		while(start<=end)
		{
			int tmp=arr[i][start];
			arr[i][start]=arr[i][end];
			arr[i][end]=tmp;
			start++;
			end--;
		}
	}
	System.out.println("After Rotation");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
}
}
