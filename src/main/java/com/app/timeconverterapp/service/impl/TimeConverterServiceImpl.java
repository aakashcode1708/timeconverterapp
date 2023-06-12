package com.app.timeconverterapp.service.impl;

import com.app.timeconverterapp.exception.HourException;
import com.app.timeconverterapp.exception.MinuteException;
import com.app.timeconverterapp.service.TimeConverterService;

public class TimeConverterServiceImpl implements TimeConverterService{

	@Override
	public String getHourInWords(int hour) {
	    String[] numbers = {"Twelve", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven"};

	    if (hour >= 0 && hour <= 12) {
	        return numbers[hour];
	    } else {
	        return "";
	    }
	}

	@Override
	public String convertToWords(String time) throws HourException, MinuteException {
		
	    String[] timeParts = time.split(":");
	    int hour = Integer.parseInt(timeParts[0]);
	    int minute = Integer.parseInt(timeParts[1]);
          if(hour>12)
        	  throw new HourException("Hour must be less than 12");
          else if(minute>59)
        	  throw new MinuteException("Minute must be less than 60");
	    String hourWords = getHourInWords(hour);
	    String minuteWords = getMinuteInWords(minute);

	    if (hour == 0 && minute == 0) {
	        return "It's Midnight";
	    } else if (hour == 12 && minute == 0) {
	        return "It's Midday";
	    } else {
	        return "It's " + hourWords + " " + minuteWords;
	    }
	}

	@Override
	public String getMinuteInWords(int minute) {
	    if (minute >= 0 && minute <= 59) {
	        String minuteString = String.format("%02d", minute);
	        int tensDigit = Character.getNumericValue(minuteString.charAt(0));
	        int onesDigit = Character.getNumericValue(minuteString.charAt(1));

	        String[] tensWords = {"", "", "Twenty", "Thirty", "Forty", "Fifty"};
	        String[] onesWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

	        if (tensDigit == 1) {
	            return onesWords[minute];
	        } else {
	            return tensWords[tensDigit] + " " + onesWords[onesDigit];
	        }
	    } else {
	        return "";
	    }	
	}

}
