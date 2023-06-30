//best approach
package array_questions;
import java.util.*;
public class rotate_left_3approach {

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
		Rotate(arr, 0, k-1);
		Rotate(arr, k,n-1);
		Rotate(arr, 0 ,n-1);
		System.out.println("After rotation: ");
		for(int x:arr)
			System.out.print(x+" ");
		
	}
public static void Rotate(int[]arr, int i, int j)
{
	while(i<=j)
	{
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		i++;
		j--;
	}
}
}



/* complexity:   time : O(2*n)---> O(n)
but space complexity is O(1)
*/	