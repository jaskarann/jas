class numbers
{
	boolean prime_num(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
	boolean is_even(int n)
	{
		if(n%2==0)
		{
			return true;
		}
		return false;
	}
	boolean is_divisibleby5(int n)
	{
		if(n%5==0)
		{
			return true;
		}
		return false;
	}
}
public class Num
{
	public static void main(String[] args)
	{
		numbers p=new numbers();
		System.out.println(p.prime_num(10));
		System.out.println(p.is_even(10));
		System.out.println(p.is_divisibleby5(10));
	}
}
