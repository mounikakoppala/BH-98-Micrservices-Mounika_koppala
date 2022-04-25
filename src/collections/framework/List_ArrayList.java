package collections.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Collection --> List,Set,Map and queue
//List --> just list of item, indexing, duplicates are allowed

public class List_ArrayList
{
	int a=20;
	//Interger b=28; it is a wrapper classes given integer acts as object
public static void main(String[] args) 
{
	List<Integer> list=new ArrayList<Integer>();//
	list.add(26);
	list.add(23);
	list.add(56);
	list.add(78);
	System.out.println(list);
	
	
     Collections.sort(list);
	 System.out.println(list);
	
	
	
	Iterator itr=list.iterator();
    while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	for(Integer x:list)
	{
		System.out.println(x);
	}
}
}

