//Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.


class EndUp
{
	public String endUp(String str) 
	{
  		int n=str.length();
  		if (n>=3)
  			return (str.substring(0,n-3)+str.substring(n-3,n).toUpperCase());
  		else
  			return(str.toUpperCase());
}

}
public class EndUp_test
{
	public static void main(String[] args)
	{
		EndUp s=new EndUp();
		System.out.println(s.endUp("Hello"));
	}
}