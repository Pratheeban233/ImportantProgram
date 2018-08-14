package Interview_Questions;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1564;
int r,s=0;
while(n>0)
{
	r=n%10;
	n=n/10;
	s=s*10+r;
}
System.out.print(s);
	}

}
