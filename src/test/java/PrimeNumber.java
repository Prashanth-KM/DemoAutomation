public class PrimeNumber {

	public static void main(String[] args) {
		int n=5;
		int k=0;
		for(int i=2;i<n;i++)
		if(n%i==0) {
			k=1;
			break;
		}
		if(k==1) {
			System.out.println("number is not prime");
		} else {
			System.out.println("number is prime");
		}
	}
}
