public class fizzbuzzz
{
	public static void main(String[] args)
		{  
		   for(int i=0;i<=100;i++)
			{String j=(i%5==0)?(i%3==0?"fizzbuzz":"buzz"):(i%3==0?"fizz":String.valueOf(i));
			 System.out.println(j);
			}
		}
}