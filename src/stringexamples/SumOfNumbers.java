package stringexamples;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		int n=1234,sum=0,r;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
			
		}
		System.out.println(sum);

	}

}
