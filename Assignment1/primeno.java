public class primeno
{
 public static void main(String[] args)
  {  
    int n;
    int num=23;
    for(n=2;n<Math.sqrt(num);n++) 
    {
     if(num%n==0)
      {
       System.out.println("num  is not prime ");
       break;
      }
     else
      { 
       System.out.println("num  is prime ");
       break;
      }
    }
  }
  
}