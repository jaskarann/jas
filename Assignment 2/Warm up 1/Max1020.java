//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
.



class Max1020
{
	public int max1020(int a, int b) 
	{
   		if ((a>=10 && a<=20 )&&(b>=10 && b<=20))
   			return (a>b?a:b);
  		if(a>=10 && a<=20 )
  			return a;
  		if (b>=10 && b<=20)
   			return b;
  		else
  			return 0;
	}

}
public class Max1020_test
{
	public static void main(String[] args)
	{
		Max1020 s=new Max1020();
		System.out.println(s.max1020(15,90));
	}
}