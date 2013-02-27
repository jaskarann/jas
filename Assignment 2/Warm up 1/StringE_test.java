//Return true if the given string contains between 1 and 3 'e' chars. 

class StringE
{
	public boolean stringE(String str) 
	{
		int count = 0;

  		for (int i=0; i<str.length(); i++) 
		{
    			if (str.substring(i, i+1).equals("e")) 
    			count++;
		}
    
	  	

		return (count>= 1 && count <=3);
  
	}
}
public class StringE_test
{
	public static void main(String[] args)
	{
		StringE s=new StringE();
		System.out.println(s.stringE("Hello"));
	}
}