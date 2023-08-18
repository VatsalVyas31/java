import java.util.Scanner;
class Calc
{
	int n1,n2;
	void sum(int a,int b)
	{
	int tot=a+b;
	System.out.println("sum is"+tot);
	}
	public static void main(String[]a)
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Calc c=new Calc();
		c.sum(n1,n2);		
	}

}