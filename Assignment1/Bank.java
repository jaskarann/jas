class BankAccount
{
	 String Name;
	 String Account_no;
	 float Account_balance;
	 
 	 void set_acc_details(String name,String acc_no,float balance)
		{
                  Name=name;
                  Account_no=acc_no;
		  Account_balance=balance;
                  System.out.println("Name is =" +Name) ;
	          System.out.println("Account No is =" +Account_no);
                  System.out.println("Account balance is =" +Account_balance);
		}
	
	void deposit(float amount)
		{
  		  Account_balance+=amount;
		}
         
	void withdraw(float amount)
 		{
  		  if(amount>Account_balance)
		      {
			System.out.println("Insufficient balance");
  			return;
		      }
		  else
		      {
			Account_balance-=amount;
		      }
		}
	void change_name(String name)
		{
		   Name=name;
		}
 	void Print_balance()
		{
		   System.out.println("Account balance is =" +Account_balance);
		}
	void print_accountno()
		{
		  System.out.println("Account no is = " + Account_no);
		}
}
 
public class Bank
{
	public static void main(String[] args)
		{
		   BankAccount p=new BankAccount();
		   p.set_acc_details("Geet","SBI9032",1000000);
		 }
}