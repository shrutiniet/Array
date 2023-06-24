package Searching;
import java.util.*;
public class linera_search {

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
		int found=-1;
		for(int i=0;i<n;i++)
		{
			if(val==arr[i])
				found=i;
		}
		if(found==-1)
			System.out.println("Value not exist in array");
		else
			System.out.println("Value found at index= "+found);
	}

}
