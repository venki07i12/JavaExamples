package forloop;

public class Perfect_Number {

	public static void main(String[] args) {
		int n=28,sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println("it is aperfect number");
		}
		else {
			System.out.println("not a  perfect number");
		}

	}

}
