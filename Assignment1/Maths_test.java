class Maths
{
	int square(int a)
	{
		return(a*a);
	}
	int square_root(int a)
	{
		int l=0,c=0;
		for(int i=0;i<=a;i++)
		{
			
			l=i-1;
		        c=i*i;
			if(c>a)
 			   break;

		}
		return l;
	}
	int cube_root(int a)
	{ 
		int l=0,c=0;
		for(int i=0;i<=a/2;i++)
		{
			l=i-1;
		        c=i*i*i;
			
			if(c>a)
				break;
			
			
		}
		return l;

	}
	int power(int base,int power)
	{
		int result=1;
               for(int i=0;i<=power;i++)
		{
			result*=base;
		}
		return result;
	}
	int factorial(int n)
	{	if(n==0)
			return 1;
		else
			{
				int fact=n*factorial(n-1);
				return fact;
			}
	}
}
public class Maths_test
{
	public static void main(String[] args)
	{
		Maths p=new Maths();
		System.out.println(p.square(5));
		System.out.println(p.square_root(4));
		System.out.println(p.cube_root(8));
		System.out.println(p.power(2,5));
		System.out.println(p.factorial(5));
	}
}


				
			
