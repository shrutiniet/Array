package array_questions;
import java.util.*;
public class left_rotate_1approach {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter no. of rotation: ");
		int k=sc.nextInt();
		if(k>n)
			k=k%n;
		int count=1;
		while(count<=k)
		{
			int val=arr[0];
			for(int i=1;i<n;i++)
			{
				int tmp=arr[i];
				arr[i-1]=arr[i];
				arr[i]=tmp;
			}
			arr[n-1]=val;
			
			System.out.println("After "+ count +" rotation : ");
			
			for(int i: arr)
				System.out.print(i+" ");
			count++;
			System.out.println();
		}

	}

}
