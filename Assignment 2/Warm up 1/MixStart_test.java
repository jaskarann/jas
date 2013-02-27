//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count. 


class MixStart
{
	public boolean mixStart(String str) 
	{
		if(str.length() >=3 && str.substring(1,3).equals("ix"))
			return true;
		else
			return false;

  	}

}
public class MixStart_test
{
	public static void main(String[] args)
	{
		MixStart s=new MixStart();
		System.out.println(s.mixStart("rix drop"));
	}
}