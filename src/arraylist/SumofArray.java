package arraylist;

public class SumofArray {

	public static void main(String[] args) {
		
		int a[] = {5,4,2,3,7};
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
