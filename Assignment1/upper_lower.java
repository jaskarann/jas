public class upper_lower
{
 public static void main(String[] args)
  {  
    char letter='A';
    
    if(letter>='A'&&letter<='Z')
    {
      letter=(char)(letter+('a'-'A'));
    }
    else
     {
     
       letter=(char)(letter-('a'-'A'));
      }
    System.out.print("letter is  "+letter);  

  }
  
}
