package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FilterVowels 
{
	public static void main(String[] args) 
	{
		String vowels="AEIOUaeiou";
		String names[]= {"karthik","navaneeth","akash","lakki"};
		List<String> list=Arrays.asList(names);
	     for(String i: list)
	     {
		 
		
		i.chars().filter(x -> vowels.indexOf(x) != -1).forEach( y -> System.out.println((char)y));
		
		
	}
}
}
