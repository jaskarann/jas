//Given 2 int values, return true if either of them is in the range 10..20 inclusive. 




class In1020
{
	public boolean in1020(int a, int b) 
	{
		return((a>=10 && a<=20) || (b>=10 && b<=20));
	}

}
public class In1020_test
{
	public static void main(String[] args)
	{
		In1020 s=new In1020();
		System.out.println(s.in1020(8,99));
	}
}