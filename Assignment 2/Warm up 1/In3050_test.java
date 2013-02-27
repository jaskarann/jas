//Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive. .




class In3050
{
	public boolean in3050(int a, int b) 
	{
  		return(((a>=30&&a<=40)&&(b>=30&&b<=40))||((a>=40&&a<=50)&&(b>=40&&b<=50)));
	}


}
public class In3050_test
{
	public static void main(String[] args)
	{
		 In3050 s=new In3050();
		System.out.println(s.in3050(15,99));
	}
}