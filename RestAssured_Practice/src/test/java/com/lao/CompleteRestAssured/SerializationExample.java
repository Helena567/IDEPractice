package com.lao.CompleteRestAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class SerializationExample {
	
	
	@Test
	public void serialization() {
		
		Map <String,Object> jsonBody = new HashMap <String,Object>();
		
		
		List<String> array = new ArrayList<String>();
		
		array.add("Singing");
		array.add("Dancing");
		
		
		jsonBody.put("first_name", "Ricky");
		jsonBody.put("last_name","Bhai");
		jsonBody.put("skills", array);
		
		System.out.println(jsonBody);
		
	}

}
