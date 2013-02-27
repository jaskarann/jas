//Given a string, return a new string where the first and last chars have been exchanged.

class FrontBack
{
	public String frontBack(String str) 
	{
		if(str.length()>=2)
		{
			return(str.charAt(str.length()-1)+str.substring(1,str.length()-1)+ str.charAt(0));
		}
		return str;  
	}
}
public class FrontBack_test
{
	public static void main(String[] args)
	{
		FrontBack s=new FrontBack();
		System.out.println(s.frontBack("Hello"));
	}
}