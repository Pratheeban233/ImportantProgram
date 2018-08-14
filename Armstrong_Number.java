package Interview_Questions;

public class Armstrong_Number {

	public static void main(String[] args) {
		// Armstrong_Number 1,153,370,371,407 etc.,
int n=13;
int r,s=0;
int temp=n;
while(n>0)
{
	r=n%10;
	n=n/10;
	s=s+(r*r*r);
}
if(temp==s)
{
System.out.print("Armstrong Number");
	}
else
{
	System.out.print("Not Armstrong Number");
}
}
}