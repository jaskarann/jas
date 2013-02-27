//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.



class EveryNth
{
	public String everyNth(String str, int n) 
	{
		String result = "";
  
  		for (int i=0; i<str.length(); i = i + n) {
    			result = result + str.charAt(i);
  	}
  	return result;
  
}

}
public class EveryNth_test
{
	public static void main(String[] args)
	{
		EveryNth s=new EveryNth();
		System.out.println(s.everyNth("Hello",2));
	}
}