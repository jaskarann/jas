/*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/

class make
{
	public boolean makes10(int a, int b) 
	{
		return(a==10 || b==10 || (a+b)==10);
  
	}
}
public class make_test
{
	public static void main(String[] args)
	{
		make s=new make();
		System.out.println("are we are in trouble  "+s.makes10(1,2));
	}
}