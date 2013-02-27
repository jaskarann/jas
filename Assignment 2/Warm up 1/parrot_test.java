class parrot
{
	public boolean parrotTrouble(boolean talking, int hour) 
	{
  		return(talking && (hour>=0 && hour<7 || hour>20 && hour<=23));
	}
}
public class parrot_test
{
	public static void main(String[] args)
	{
		parrot s=new parrot();
		System.out.println("are we are in trouble  "+s.parrotTrouble(true,22));
	}
}