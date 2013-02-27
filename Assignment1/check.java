class student
{
	String name;
	int roll_no;
	int number_of_books_issued;
	void set_student_detail(String Name,int Roll,int books)
	{
		name=Name;
		roll_no=Roll;
		number_of_books_issued=books;
		System.out.println(name);
	}
}
class library
{
	int total_books;
	int book_name;
	int copies_of_book;
	int copies_issued;
}
public class check
{
	public static void main(String[] args)
	{
		student [] a=new student[10];
		
		a[1]=new student();
		a[1].set_student_detail("aman",1,1); 

		a[2]=new student();
		a[2].set_student_detail("foran",2,2);

		a[3]=new student();
		a[3].set_student_detail("geet",3,0);
	}
}

	