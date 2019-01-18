package com.example.practice.test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

import org.springframework.web.client.RestTemplate;

public class Test23 {
	public static void main(String[] args) {
		Field f1 = new Field("a", "string");
		Field f2 = new Field("b", "integer");
		
		Page p = new Page();
		
		Stream.of(p.getSections()).forEach(m -> Stream.of(m.getFields()).forEach(f -> System.out.println(f)));
	}
	
	
	
}

 class Page{
    private Section[] sections;

	public Section[] getSections() {
		return sections;
	}

	public void setSections(Section[] sections) {
		this.sections = sections;
	}
    
}

 class Section{
    private Field[] fields;

	public Field[] getFields() {
		return fields;
	}

	public void setFields(Field[] fields) {
		this.fields = fields;
	}
    
    
}

 class Field{
    private String name;
    private String type;
    
    public Field(String name, String type) {
    	this.name = name;
    	this.type = type;
	}
}

