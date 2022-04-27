package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentRecordDepWise1
{
public static void main(String[] args) 
{
	Department3 dep1= new Department3(111,"ECE");
	Department3 dep2= new Department3(222,"MECH");
	
	Student4 st1=new Student4(101,"mouni",dep1,95);
	Student4 st2=new Student4(102,"jp",dep2,85);
	Student4 st=new Student4(103,"lakki",dep1,75);
	Student4 st3=new Student4(104,"megh",dep1,85);
	Student4 st4=new Student4(105,"likhil",dep2,68);
	Student4 st5=new Student4(106,"manja",dep2,82);
	List<Student4> list =Arrays.asList(st1,st2,st3,st4,st5);
	Map<Department3,List<Student4>> mylist=list.stream().collect(Collectors.groupingBy(Student4::getDep));
	
}
}
class Department3
{
	private int refid;
	private String dep;
	public Department3(int refid, String dep) {
		super();
		this.refid = refid;
		this.dep = dep;
	}
	public int getRefid() {
		return refid;
	}
	public void setRefid(int refid) {
		this.refid = refid;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Department3 [refid=" + refid + ", dep=" + dep + "]";
	}
	
}

class Student4
{
	private int stud_id;
	private String name;
	private Department3 dep;
	private int marks;
	
	public Student4(int stud_id, String name, Department3 dep, int marks) 
	{
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.dep = dep;
		this.marks = marks;
	}

	public int getStud_id() 
	{
		return stud_id;
	}

	public void setStud_id(int stud_id) 
	{
		this.stud_id = stud_id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Department3 getDep() 
	{
		return dep;
	}

	public void setDep(Department3 dep) 
	{
		this.dep = dep;
	}

	public int getMarks() 
	{
		return marks;
	}

	public void setMarks(int marks) 
	{
		this.marks = marks;
	}

	@Override
	public String toString() 
	{
		return "Student4 [stud_id=" + stud_id + ", name=" + name + ", dep=" + dep + ", marks=" + marks + "]";
	}
	
	
}