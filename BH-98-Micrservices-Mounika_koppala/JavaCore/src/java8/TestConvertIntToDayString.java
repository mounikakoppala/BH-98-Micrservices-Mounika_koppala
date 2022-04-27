package java8;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
public class TestConvertIntToDayString 
{
public static void main(String[] args)
{
	List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
	for(int i:list)
	{
	DayOfWeek dayofweek= DayOfWeek.of(i);
	System.out.println(dayofweek);

}
}
}