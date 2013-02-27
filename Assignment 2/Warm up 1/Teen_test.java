//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both. 



class Teen
{
	public boolean loneTeen(int a, int b) 
	{ 
		if(((a>=13 && a<=19) &&( b<13 || b>19))||((a<13 || a>19) &&( b>=13 && b<=19)))
 			return true;
 		return false;
 
  
	}

}
public class Teen_test
{
	public static void main(String[] args)
	{
		Teen s=new Teen();
		System.out.println(s.loneTeen(23,23));
	}
}