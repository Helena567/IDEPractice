package com.lao.JsonPathWithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import static com.jayway.jsonpath.JsonPath.parse;
import static com.jayway.jsonpath.Criteria.*;
import static com.jayway.jsonpath.Filter.filter;
public class PrecidateFilter {
	
	File jsonFile = new File ("src/test/resources/bookstore.json");
	
	public void filterPredicate() throws IOException {
		//Price < 10
		
	Filter priceLessThanTen = Filter.filter(
			
			Criteria
			.where("price")
			.lt(10));
	
	
	List <Object> result=JsonPath
	.parse(jsonFile)
	.read("$.store.book[?]", priceLessThanTen);
	
	
	System.out.println(result);
	}
	
//----------AND---------------
	//Price < 10 and Category = Fiction
	public void secondFilter() throws IOException {
		
		Filter andQuery=Filter.filter(
					Criteria
					.where("price")
					.lt(10)
					.and("category")
					.is("fiction")
					);
		
		List<Object> result = JsonPath
				.parse(jsonFile)
				.read("$.store.book[?]",andQuery);
		
		
		System.out.println(result);
	}	
//--------------------OR-------------		
		
	//Price >10 and category=fiction
	
	public void thirdFilter() throws IOException {
		
		Filter thirdQuery = filter(
				      where("price")
				      .gt(10)
				      .and("category")
				      .is("fiction"));
		
		
		
		List <Map<String,Object>> result = parse(jsonFile)
							.read("$.store.book[?]",thirdQuery);
		
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrecidateFilter example = new PrecidateFilter ();
		
	//	example.filterPredicate();
	//	example.secondFilter();
		example.thirdFilter();
		
	}

}
