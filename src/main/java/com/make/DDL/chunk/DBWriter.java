package com.make.DDL.chunk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@StepScope
@Slf4j
public class DBWriter implements ItemWriter<String>{

	Logger logger = LoggerFactory.getLogger(DBWriter.class);

	@Override
	public void write(Chunk<? extends String> chunk) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}