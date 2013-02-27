//Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.



class BackArround
{
	public String backAround(String str) 
	{
 		 return(str.charAt(str.length()-1)+str+str.charAt(str.length()-1));
	}

}
public class BackArround_test
{
	public static void main(String[] args)
	{
		BackArround s=new BackArround();
		System.out.println(s.backAround("Hello"));
	}
}