import java.util.Scanner;
class Method3
{
	int n1,n2;
	int sum(int x,int y)
	{
		int tot;
		tot=x+y;
		return tot;
	}
	public static void main(String []args)
	{
		int a,b;
		Method3 m=new Method3();
		a=10;
		b=20;
		int tab=m.sum(a,b);
		System.out.println("sum is"+tab);
	}
}