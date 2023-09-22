package com.lao.JsonPathWithJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {
	
	
	public static void pareseEverytime() throws IOException {
		
		
		File jsonFile = new File("src/test/resources/bookstore.json");
		
	List <Object> priceList= JsonPath.read(jsonFile,"$..price");
		
		for(Object price:priceList) {
			System.out.println(price);
		}
		
		
	}
	
	
	
	public static void parseOneTime() throws InvalidJsonException, IOException {
		
		InputStream jsonFile = new FileInputStream("src/test/resources/bookstore.json");
		
		
		Object parsedJsonDoc = Configuration.defaultConfiguration().jsonProvider().parse(jsonFile.readAllBytes());
		
		
		List <Object> priceList= JsonPath.read(parsedJsonDoc,"$..price");
			
			for(Object price:priceList) {
				System.out.println(price);
			}
		
		
		
	}
	
	
	public static void fluentApi() throws IOException {
		
		File jsonFile = new File("src/test/resources/bookstore.json");
		
		DocumentContext context =JsonPath.parse(jsonFile);
		
		
		List <Object> priceList = context.read("$..price");
		
		for(Object price:priceList) {
			System.out.println(price);
		}
		
		
		//Using Configuration
		
		
		Configuration configuration = Configuration.defaultConfiguration();
		
		List <Object> priceList1 = JsonPath
		.using(configuration)
		.parse(jsonFile)
		.read("$..price");
		
		
		for(Object price:priceList1) {
			System.out.println(price);
		}
		
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		pareseEverytime();
		parseOneTime(); 
		fluentApi();
	}

}
