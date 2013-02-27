class sleep
{
	
 	boolean sleepIn(boolean weekday, boolean vacation) 
	{
 		 if(weekday==false||vacation==true)
 		 	return true;
 		 else
  			return false;
	}
}
public class sleep_test
{
	public static void main(String[] args)
	{
		sleep s=new sleep();
		System.out.println("Can we sleep "+s.sleepIn(true,false));
	}
}