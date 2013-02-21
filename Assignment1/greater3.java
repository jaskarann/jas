public class greater3
{
	public static void main(String[] args)
	{
		int a=30,b=10,c=24;

		char max=a>b?(a>c?'a':'c'):(b>c?'b':'c');
 		System.out.println(max+"is greater");
	}
}