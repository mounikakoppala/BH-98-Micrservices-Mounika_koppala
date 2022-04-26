package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRecordDepwise {
	public static void main(String[] args) {
		Student s1=new Student(101,"mounika","ECE",85);
		Student s2=new Student(102,"meghana","ECE",84);
		Student s3=new Student(103,"jp","MECH",85);
		Student s4=new Student(104,"mahesh","MECH",75);
		Student s5=new Student(105,"maha","ECE",74);
		Student s6=new Student(106,"manja","MECH",65);
		List<Student> list=Arrays.asList(s1,s2,s3,s4,s5,s6);
		Map<String,List<Student>> mylist=list.stream(). collect(Collectors.groupingBy(Student::getDept));
	System.out.println(mylist);
}
}
class Student
{
	private int id;
	 private String name;
	 private String Dept;
	 private int marks;
	
	 public Student(int id, String name, String dept, int marks) {
		
		this.id = id;
		this.name = name;
		Dept = dept;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public  int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Dept=" + Dept + ", marks=" + marks + "]";
	}
	
}