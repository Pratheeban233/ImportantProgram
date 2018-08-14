package Interview_Questions;

public class Second_BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {45,4,85,75,25};
int i=0;
int max=a[i];
int max2=0;
for(;i<a.length;i++)
{
	if(a[i++]>max)
	{
	max2=max;
	max=a[i++];
	}
	else if (a[i++]>max2)
	{
		max2=a[i++];
	}
	System.out.print(max2);
	}
	}
}
