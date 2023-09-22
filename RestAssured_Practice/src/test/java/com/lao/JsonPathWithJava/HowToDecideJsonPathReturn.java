package com.lao.JsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class HowToDecideJsonPathReturn {

	
		
		
		public static void DefinitePath() throws IOException {
			
			
			File jsonFile = new File("src/test/resources/bookstore.json");
			
		String authors= JsonPath.read(jsonFile,"$.store.book[*].author");
			
			
				System.out.println(authors);
			

		}	
			
			
			public static void inDefinitePath() throws IOException {
				
				
				File jsonFile = new File("src/test/resources/bookstore.json");
				
			List <Object> authorList= JsonPath.read(jsonFile,"$.store.book[*].author");
				
				for(Object author:authorList) {
					System.out.println(author);
				}		
			}
			
				public static void main(String[] args) throws IOException {	
			
					DefinitePath();
				//	inDefinitePath();
	}

}
