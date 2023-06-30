//Brute's approach
package array_questions;
import java.util.Scanner;
public class left_rotate_2approach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter no. of rotation: ");
		int k=sc.nextInt();
		if(k>n)
			k=k%n;
		int tmp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			tmp[i]=arr[i];
			
		}
		for(int i=k;i<n;i++)
		{
			arr[i-k]=arr[i];
		}
		int l=0;
		for(int i=k+1;i<n;i++)
		{
			arr[i]=tmp[l];
			l++;
		}
		System.out.println("After rotation: ");
		for(int x: arr)
			System.out.print(x+" ");

	}

}
