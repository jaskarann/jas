public class power
{
 public static void main(String[] args)
  { 
    int base=10,power=3,result=1;
    for(int i=0;i<power;i++)
     {
       result*=base;
     }
   
    System.out.print(base+ " to the power " +power+ "is"+result);
   }
}