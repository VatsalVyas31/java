import java.util.Scanner;
class Student
{
	String name;
	double sga;
	Student(String s)
	{
		name=s;
	}
	Student(String s,double g)
	{
		name=s;
		sga=g;
	}
}
public class Construct
{
public static void main(String[]args)
{
	Student s1=new Student("vatsal");
	Student s2=new Student("vatsal",5.10);
	System.out.println(s1.name+"\t"+s1.sga);
	System.out.println(s2.name+"\t"+s2.sga);
	}
}