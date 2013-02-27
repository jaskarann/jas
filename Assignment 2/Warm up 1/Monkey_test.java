class Monkey
{
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
	{
 		if(aSmile && bSmile || !aSmile && !bSmile)
   		{
			return true;
   		}
  		 return false;
	}
}
public class Monkey_test
{
	public static void main(String[] args)
	{
		Monkey s=new Monkey();
		System.out.println("IS MOnkey in trouble  "+s.monkeyTrouble(true,false));
	}
}