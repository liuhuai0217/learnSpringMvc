package com.convertAndFormat.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
public class StringToConvert implements Converter<String, Date>{

	private String dataPatten;
	
	public StringToConvert(String dataPatten){
		this.dataPatten = dataPatten;
	}
	@Override
	public Date convert(String s) {
		// TODO Auto-generated method stub
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(dataPatten);
			dateFormat.setLenient(false);
			
			return dateFormat.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException("invalid date format ********");
		}
	}

}
