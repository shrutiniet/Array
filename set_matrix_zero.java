package array_questions;
import java.util.*;
public class set_matrix_zero {

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
		//Approach1(arr,m,n);    //O(n*N*N)
		Approach2(arr,m,n);
		

	}
public static void Approach1(int[][]arr, int m, int n)
{
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i][j]==0)
				Change_to_negative(arr,m,n,i,j);
		}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i][j]==-1)
				arr[i][j]=0;
		}
	}
	System.out.println("After Changes: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
public static void Change_to_negative(int[][]arr, int m,int n, int i, int j)
{
	for(int a=0;a<n;a++)
	{
		if(arr[i][a]!=0)
			arr[i][a]=-1;
	}
	for(int b=0;b<m;b++)
	{
		if(arr[b][j]!=0)
			arr[b][j]=-1;
	}
}
public static void Approach2(int[][]arr, int m, int n)
{
	int rows[]= new int[m];
	int cols[]= new int[n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(arr[i][j]==0)
			{
				rows[i]=1;
				cols[j]=1;
			}
		}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(rows[i]==1 || cols[j]==1)
				arr[i][j]=0;
		}
	}
	System.out.println("After Changes: ");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}	
}
}
