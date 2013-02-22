class worm
{
		 int pow(int base,int power)
		 {       if(power==0)
				return 1;
			else
			{
				int result=1;
				for(int i=0;i<power;i++)
				{
				 result*=base;
				}
			
				return result;
			}
		}
 		void testnum(int num,int sep)
		{
			int temp;
			while(num!=0)
			{
				temp=0;
				int count=0;
				if(num%10==sep)
				{
					num=num/10;
					continue;
				}
				while((num%10)!=sep)
				{
					temp=(num%10)*pow(10,count)+temp;
					count++;
					num=num/10;	
				}
				System.out.print(temp+" ");
				
				
			}
		}

 		int worm1(int r1,int r2,int a)
		{
			int sum=0;

		
			for(int i=r1;i<r2;i++)
			{
				int temp=i;
				while(temp!=0)
				{
					int num=0,count=0;
					if(temp%10==a)
					{
						temp=temp/10;
						continue;
					}
				while(temp%10!=a)
				{
					num =(temp%10)*pow(10,count)+num;
					count++;
					temp=temp/10;
					
					
				}
				
				sum=sum+num;
				
			}
			
			System.out.println();
		
		}
		return sum;

		}
}
public class bookworm
{
	public static void main(String[] args)
	{       worm b=new worm();
  		b.testnum(40560,0);
		System.out.print(b.worm1(1,10000,0));
		
	}
}