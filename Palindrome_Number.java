package Interview_Questions;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  n=121;
int r,s=0;
int temp=n;
while(n>0)
{
r=n%10;		
n=n/10;
s=s*10+r;
	}
	if(temp==s)
	{
		System.out.print("palindrome");
	}
		else
		{
			System.out.print("not palindrome");
		}
	}

}
