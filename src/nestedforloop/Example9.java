package nestedforloop;

public class Example9 {

	public static void main(String[] args) {
		
		int k=2;
		for(int i=1; i<=5; i++)
		{
			for(int j=2; j<=i; j++)
			{
			System.out.print(k+ " ");
			k++;
			}
			System.out.println();
		}
}
}
