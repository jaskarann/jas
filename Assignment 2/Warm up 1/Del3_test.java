//Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.




class Del3
{
	public String delDel(String str)
 	{
 		if(str.length() >3 && str.substring(1,4).equals("del"))
 		{
 			return ( str.charAt(0)+str.substring(4,str.length()));
 		}
 		return str;
  
	}


}
public class Del3_test
{
	public static void main(String[] args)
	{
		Del3 s=new Del3();
		System.out.println(s.delDel("adelsd"));
	}
}