package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatingGrade 
{
@RequestMapping("/studentsgrade/{marks}")
String studentGrade(@PathVariable int marks)
{
	return (calcu(marks));
	
}
String calcu(int marks)
{
if(marks>=80)
{
	return (" Student grade is A") ;
}
else if(marks<80 && marks>=60)
{
	return(" Student grade is B" );
}
else if(marks<60 && marks>=40)
{
	return(" Student grade is C" );
}
else
{
	return("Student is fail");
}
}
}