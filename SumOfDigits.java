package Interview_Questions;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=918273;
		int r;
		int digit=0;
		while(n>0)
			{
				r=n%10;
				n=n/100;
				digit=digit+r;
				}
				System.out.print(digit);
				}
			}


