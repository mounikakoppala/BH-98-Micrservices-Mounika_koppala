package java8;

public class Student3
{
	private int id;
	 private String name;
	 private Department1 dept;
	 private int marks;
	public Student3(int id, String name, Department1 dept, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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
	public Department1 getDept() {
		return dept;
	}
	public void setDept(Department1 dept) {
		this.dept = dept;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}
	
	 
}
class Department1
{
	private int id;
	private String Dep;
	public Department1(int id, String dep) 
	{
		this.id = id;
		Dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDep() {
		return Dep;
	}
	public void setDep(String dep) {
		Dep = dep;
	}
	@Override
	public String toString() {
		return "Deparment [id=" + id + ", Dep=" + Dep + "]";
	}
	
}

