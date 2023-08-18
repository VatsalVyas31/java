class Divisible
{
public static void main(String args[])
{	
	int i,sum=0;
	for(i=20;i<=60;i++)
	{
	if(i%9==0)
	{
	System.out.println(i);
	sum=sum+i;
	}
	}
	System.out.println(sum);
    }
}
