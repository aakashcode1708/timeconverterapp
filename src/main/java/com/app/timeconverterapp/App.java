package com.app.timeconverterapp;

import com.app.timeconverterapp.controller.TimeConverterController;
import com.app.timeconverterapp.exception.HourException;
import com.app.timeconverterapp.exception.MinuteException;

public class App 
{
    public static void main( String[] args ) throws HourException, MinuteException
    {
        TimeConverterController timeConverter=new TimeConverterController();
        timeConverter.printTimeInWords();
    }
}
