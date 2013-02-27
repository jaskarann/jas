//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


class NotString
{
	public String notString(String str) 
	{
		if (str.length() >=3 && str.substring(0,3).equals("not"))
 			return str;
 		else
 			return ("not "+str);
  
	}
}
public class string_test
{
	public static void main(String[] args)
	{
		NotString s=new NotString();
		System.out.println(s.notString("not bad"));
	}
}