package collections.framework;

import java.util.LinkedHashMap;
import java.util.Map;


public class CreditCardApp 
{
public static void main(String[] args) 
{
	Map<CredittCard,Customer> myMap=new LinkedHashMap<CredittCard,Customer>();
	
	myMap.put(new CredittCard(101,"mounika",22), new Customerr("mounika",222));
	myMap.put(new CredittCard(102,"kamala",21), new Customerr("kamala",444));
	myMap.put(new CredittCard(103,"jaya",28), new Customerr("jaya",111));
	myMap.put(new CredittCard(104,"lakki",12), new Customerr("lakki",333));
	
	Map<CredittCard,Customer> result=new LinkedHashMap<CredittCard,Customer>();
 // result = sortMap(myMap);
  
 // for(CredittCard x:result.keySet())
  //{
	 // System.out.println(x + "="+result.get(x));
 // }
  
  
	
	
}



}
