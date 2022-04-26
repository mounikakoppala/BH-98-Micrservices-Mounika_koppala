package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//give student record who scored maximum marks in his department.
public class StudentRecordMaxmarksInDepWise 
{
public static void main(String[] args) {
	Student1 s1=new Student1(101,"mounika","ECE",85);
	Student1 s2=new Student1(102,"meghana","ECE",84);
	Student1 s3=new Student1(103,"jp","MECH",85);
	Student1 s4=new Student1(104,"mahesh","MECH",75);
	Student1 s5=new Student1(105,"maha","ECE",74);
	Student1 s6=new Student1(106,"manja","MECH",65);
	List<Student1> list=Arrays.asList(s1,s2,s3,s4,s5,s6);
	Map<String,List<Student1>> mylist=list.stream().filter(x -> x.getMarks()>80). collect(Collectors.groupingBy(Student1::getDept));
System.out.println(mylist);
}
}
class Student1
{
	private int id;
	 private String name;
	 private String Dept;
	 private int marks;
	
	 public Student1(int id, String name, String dept, int marks) {
		
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