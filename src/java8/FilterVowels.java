package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FilterVowels 
{
	public static void main(String[] args) 
	{
		List<Character> vowels=Arrays.asList('a','i','e','o','u','s');
		String names[]= {"karthik","navaneeth","akash","lakki"};
		List list=Arrays.asList(names);
	     for(Character i: vowels)
	     {
		 
		
		list.stream().filter(x -> vowels.remove(i)).forEach( System.out::println);
		
		
	}
}
}
