package collections.framework;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

//WAP to create credit card application associated with customer object, sort based on credit card expiry date.
public class CreditCard
{
public static void main(String[] args) 
{
	Customer c1=new Customer (24,"mounika",99323234);
	Customer c2=new Customer (22,"meghana",993453234);
	Customer c3=new Customer (25,"prakash",99323267);
	//Set<Customer> mySet = new LinkedHashSet<Customer>();
	//mySet.add(c1);
	//mySet.add(c2);
	Map<Integer,Customer> mymap = new LinkedHashMap<Integer,Customer>();
	mymap.put(111, c1);
	mymap.put(222, c3);
	mymap.put(333, c2);
	System.out.println(mymap);
	for(Integer x:mymap.keySet()) 
	{
		System.out.println(mymap.get(x));
	}

	
	
}
}
class Customer implements Comparable
{
	int expirydate;
	String name;
	long acno;
	public int key;
	
	
	public Customer(int expirydate, String name, long acno) {
		
		this.expirydate = expirydate;
		this.name = name;
		this.acno = acno;
	}
	
	
	public int getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(int expirydate) {
		this.expirydate = expirydate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}


	@Override
	public String toString() {
		return "Customer [expirydate=" + expirydate + ", name=" + name + ", acno=" + acno + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(acno, expirydate, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return acno == other.acno && expirydate == other.expirydate && Objects.equals(name, other.name);
	}
}


	/*@Override
	public int compareTo(Object o) {
		
	return this.getExpirydate().compareTo(((Customer) o).getExpirydate()));
	
	//return this.getName().compareTo(((User) o).getName());
	}
}*/