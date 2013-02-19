public class reverse_num
{
 public static void main(String[] args)
  {  
    int num=243;
    int new_num=0;
    while(num!=0)
     {
      int rev=num%10;
      num=num/10;
      new_num=new_num*10+rev;
      }
    System.out.print("reverse of num is "+new_num);  
  }
  
}
