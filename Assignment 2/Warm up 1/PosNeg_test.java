//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

class PosNeg
{
	public boolean posNeg(int a, int b, boolean negative) 
	{
	return(negative?((a<0 && b<0)? true:false):((a<0 && b>=0 || a>=0 && b<0)?true:false));
  	}
}
public class PosNeg_test
{
	public static void main(String[] args)
	{
		PosNeg s=new PosNeg();
		System.out.println(" posNeg is "+s.posNeg(-1,2,true));
	}
}