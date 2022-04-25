package collections.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentCalcutorusingList 
{
public static void main(String[] args)
{
	
	//Student st1=new Student(35,"mounika",93);
	List<Student> list=new ArrayList();
	Student st=new Student(34,"mouni",87);
	list.add(st);
	//list.add(st1);
	System.out.println(list.get(0).name);
	
}
}
	
	
	
	/*public void  gradeCalculator(list st) 
	{
		if(st.marks>= 90 && st.marks<=100) {
			System.out.println("Student "+st.name+" scored "+ "Grade-A");
		}else if(st.marks>= 80 && st.marks<=90) {
			System.out.println("Student "+st.name+" scored "+ "Grade-B");
		}else if(st.marks>= 70 && st.marks<=80) {
			System.out.println("Student "+st.name+" scored "+ "Grade-C");
		}else {
			System.out.println("Student "+st.name+" scored "+ "Failed!");
		}
	}
	
}	*/


class Student
{
	 int rollno;
	 String name;
	 int marks;
	
	Student(int rollno,String name,int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
}


		
	

	

