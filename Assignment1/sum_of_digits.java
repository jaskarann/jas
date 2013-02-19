public class sum_of_digits
{
 public static void main(String[] args)
  {  
    int num=243;
    int sum=0;
    while(num!=0)
     {
      int digit=num%10;
      num=num/10;
      sum+=digit;
      }
    System.out.print("sum of digits of num is "+sum);  
  }
  
}
