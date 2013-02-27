//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number. 
class near100
{
	public boolean nearHundred(int n) 
	{
  		return(Math.abs(100-n)<=10 || Math.abs(200-n)<=10);
	}
}
public class near_test
{
	public static void main(String[] args)
	{
		near100 s=new near100();
		System.out.println("is near 100 or 200 "+s.nearHundred(55));
	}
}