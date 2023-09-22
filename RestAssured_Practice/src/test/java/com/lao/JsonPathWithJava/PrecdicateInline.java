package com.lao.JsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class PrecdicateInline {
	
	
	File jsonFile = new File ("src/test/resources/bookstore.json");
	
	public void inlinePredicate() throws IOException {
		
		
		
		List <Object> result=JsonPath.parse(jsonFile)
							 .read("$.store.book[?(@.price<10)].price");
		
		
		System.out.println(result);
		

		
		
		// AND --->  Price < 10 and Category = Fiction
		
		List <Object> resultAnd =JsonPath.parse(jsonFile)
				 .read("$.store.book[?(@.price<10 && @.category =='fiction')]");
		
		System.out.println(resultAnd);
		
		
		
		//OR --->  Price >10 category=reference
		
		List <Object> resultOr =JsonPath.parse(jsonFile)
				 .read("$.store.book[?(@.price>10 || @.category=='reference')]");
		
		System.out.println(resultOr);
	
		
		//NEGATION --->!
		
				List <Object> resultN =JsonPath.parse(jsonFile)
						 .read("$.store.book[?(!(@.price>10 || @.category=='reference'))]");
				
				System.out.println(resultN);
		
	}	
		
		
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrecdicateInline example = new PrecdicateInline();
		example.inlinePredicate();
		
		
	}	

}
