package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calci
{

	@RequestMapping("/students/{num1}/{num2}")
	 String calculator(@PathVariable int num1,@PathVariable int num2)
	 {
		 int addition=num1+num2;
		 double mul=num1*num2;
		 double div=num1/num2;
		 return ("operation results of Addition is "+addition+" Multiplication is "+mul+" Division is "+div);
	 }
}

