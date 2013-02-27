class diff
{
	public int diff21(int n) 
	{
		return ((n>21)?2*(n-21):(21-n));
  
	}
}
public class diff_test
{
	public static void main(String[] args)
	{
		diff s=new diff();
		System.out.println("Abs diff  is  "+s.diff21(23));
	}
}