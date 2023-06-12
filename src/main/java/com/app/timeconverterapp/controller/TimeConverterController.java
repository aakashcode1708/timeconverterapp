package com.app.timeconverterapp.controller;

import java.util.Scanner;

import com.app.timeconverterapp.exception.HourException;
import com.app.timeconverterapp.exception.MinuteException;
import com.app.timeconverterapp.service.TimeConverterService;
import com.app.timeconverterapp.service.impl.TimeConverterServiceImpl;

public class TimeConverterController {
public void printTimeInWords() throws HourException, MinuteException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter time in 12 hrs format");
	String time=sc.next();
		TimeConverterService service=new TimeConverterServiceImpl();
		String timeInWords=service.convertToWords(time);
		System.out.println("Time In Words: "+timeInWords);
	
}
}
