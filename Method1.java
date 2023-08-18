import java.util.Scanner;
class Method1
{
	int n1,n2;
	void sum()
	{
		int tot;
		tot=n1+n2;
		System.out.println("sum is"+tot);
	}
	public static void main(String []a)
	{
		Method1 c=new Method1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n1");
		c.n1=sc.nextInt();
		System.out.println("enter value of n2");
		c.n2=sc.nextInt();
		c.sum();
	}
}