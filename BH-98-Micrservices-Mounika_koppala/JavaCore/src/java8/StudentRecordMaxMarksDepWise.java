package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRecordMaxMarksDepWise {
	public static void main(String[] args) 
	{
		Department1 dept1= new Department1(111,"Ece");
		Department1 dept2= new Department1(112,"Mech");
		
		
		Student3 s1=new Student3(101,"mounika",dept1,85);
		Student3 s2=new Student3(102,"meghana",dept1,84);
		Student3 s3=new Student3(103,"jp",dept2,85);
		Student3 s4=new Student3(104,"mahesh",dept2,75);
		Student3 s5=new Student3(105,"maha",dept1,74);
		Student3 s6=new Student3(106,"manja",dept2,65);
		List<Student3> list=Arrays.asList(s1,s2,s3,s4,s5,s6);
		Map<Department1,List<Student3>> mylist=list.stream().filter(x -> x.getMarks()>80).collect(Collectors.groupingBy(Student3::getDept));
	System.out.println(mylist);
}
}