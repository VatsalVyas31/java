class Sinterest
{
	void Details(int p,int r,int n)
	{
		int Si;
		Si=(p*r*n)/100;
		System.out.println("Simlpe interest is:"+Si);
	}
	public static void main(String[]args)
	{
	Sinterest s =new Sinterest();
	s.Details(500,8,2);
	}
}