package com.make.DDL.chunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@StepScope
@Slf4j
public class CsvReader implements ItemReader<String>{
	Logger logger = LoggerFactory.getLogger(CsvReader.class);
	
	//配列
	private String[] input = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

	private int index = 0;
	
	@Override
	public String read() throws Exception,UnexpectedInputException,ParseException,NonTransientResourceException{
		if (input.length > index) {
			//配列の文字列を取得
			String message = input[index++];
			logger.info("Read:{}",message);
			
			return message;
		}
		return null;
	}
}
