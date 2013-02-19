public class upper_lower
{
 public static void main(String[] args)
  {  
    char letter='A';
    int new_letter;
    if(letter>='A'&&letter<='Z')
    {
      new_letter=letter+('a'-'A');
    }
    else
     {
     
       new_letter=letter-('a'-'A');
      }
      
     char c=new_letter;
    System.out.print("letter is  "+c);  

  }
  
}
