package com.app.timeconverterapp.service;

import com.app.timeconverterapp.exception.HourException;
import com.app.timeconverterapp.exception.MinuteException;

public interface TimeConverterService {
public String getHourInWords(int hour);
public String convertToWords(String time)throws HourException,MinuteException;
public String getMinuteInWords(int minutes);
}
