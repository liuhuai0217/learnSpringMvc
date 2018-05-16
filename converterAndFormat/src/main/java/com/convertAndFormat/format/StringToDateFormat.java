package com.convertAndFormat.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class StringToDateFormat implements Formatter<Date>{

	private String datePatten;
	
	private  SimpleDateFormat dateFormat;
	
	
	public StringToDateFormat(String datePatten) {
		// TODO Auto-generated constructor stub
		this.datePatten = datePatten;
		dateFormat = new SimpleDateFormat(datePatten);
		dateFormat.setLenient(false);
	}
	@Override
	public String print(Date date, Locale locals) {
		// TODO Auto-generated method stub
		return dateFormat.format(date);
	}

	@Override
	public Date parse(String s, Locale locals) throws ParseException {
		// TODO Auto-generated method stub
		try {
			return dateFormat.parse(s);
		} catch (Exception e) {
			// TODO: handle exception
			throw new IllegalArgumentException("invalid date format ********");
		}
		
	}

}
