package java8;

public class Department2
{
	private int id;
	private String dep;
	public Department2(int id,String dep) {
		super();
		this.id = id;
	this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public String toString() {
		return "Deparment [id=" + id + ", Dep=" + dep + "]";
	}
	
}

