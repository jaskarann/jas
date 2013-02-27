//Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).


class MissChar
{
	public String missingChar(String str, int n)
	{
  		if (n>=0 && n<str.length())
 	 	{
  			return (str.substring(0,n)+str.substring(n+1,str.length()));
  		}
  		else
  		return ("invalid");
  
	}
}
public class MissChar_test
{
	public static void main(String[] args)
	{
		MissChar s=new MissChar();
		System.out.println(s.missingChar("Hello",1));
	}
}