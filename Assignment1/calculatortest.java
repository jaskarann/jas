class calculator
{
  int add(int a,int b)
   {
    return(a+b);
   }
  int sub(int a,int b)
   {
    return(a-b);
   }
}

public class calculatortest
{
  public static void main(String[] args)
  {
   calculator c= new calculator();
   System.out.print(c.add(5,3));
  }
}