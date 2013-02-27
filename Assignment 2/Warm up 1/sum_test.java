class sum
{
	public int sumDouble(int a, int b) 
	{
  		return((a==b)?2*(a+b):(a+b));
	}
}
public class sum_test
{
	public static void main(String[] args)
	{
		sum s=new sum();
		System.out.println("Sum is  "+s.sumDouble(3,3));
	}
}