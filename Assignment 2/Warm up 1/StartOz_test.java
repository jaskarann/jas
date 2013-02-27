//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


class StartOz
{
	public String startOz(String str) 
	{ 
		String S="";
 		if (str.length() >= 1 && str.charAt(0)=='o') 
 		{
    			S+="o";
  		}
  
  		if (str.length() >= 2 && str.charAt(1)=='z') 
    			S+="z";
  	
  
 	 return S;
	}
	

}
public class StartOz_test
{
	public static void main(String[] args)
	{
		StartOz s=new StartOz();
		System.out.println(s.startOz("ozasd"));
	}
}