package collections.framework;
import java.util.*;

public class Phnbook 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Map map=new HashMap();
		System.out.println("Enter the integer number ");
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name"+i);
			String name=sc.nextLine();
			System.out.println("Enter the phone number"+i);
			int phone=sc.nextInt();
			sc.nextLine();
			map.put(name,phone); // adding the values into map by using put method
		}
		System.out.println("Enter the name to check");
		while(sc.hasNext()) //  here for camparing purpose whether the given name present in map or not if it is present print the informatioin of the given name.
		{
			
			String s=sc.nextLine();
			if(map.containsKey(s))
			{
				System.out.println(s + " ="+map.get(s)) ;
			}
			else
			{
				System.out.println("has not found");
			}
		}
		
		
		
	}
	}


