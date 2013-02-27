//Given a string, return true if the string starts with "hi" and false otherwise. 



class Hi
{
	public boolean startHi(String str) 
	{
		if(str.length() >=2 && str.substring(0,2).equals("hi"))
			return true;

		return false;
  
	}

}
public class Hi_test
{
	public static void main(String[] args)
	{
		Hi s=new Hi();
		System.out.println(s.startHi("Hello"));
	}
}