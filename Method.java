import java.util.Scanner;
class Method
{
	int add(int a, int b){
	int c=a+b;
	return c;
	}

public static void main(String[]args)
{
	Method m=new Method();
	Scanner sc=new Scanner(System.in);
	int e=sc.nextInt();
	int f=sc.nextInt();
	int c=m.add(e,f);
	System.out.println("addition is"+c);
	}
}