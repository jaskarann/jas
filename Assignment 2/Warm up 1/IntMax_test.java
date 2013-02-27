//Given three int values, a b c, return the largest. 


class IntMax
{
	public int intMax(int a, int b, int c) 
	{
  		return(a>b?(a>c?a:c):(b>c?b:c));
	}

}
public class IntMax_test
{
	public static void main(String[] args)
	{
		IntMax s=new IntMax();
		System.out.println(s.intMax(3,5,2));
	}
}