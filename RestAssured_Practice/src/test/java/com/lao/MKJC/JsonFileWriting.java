package com.lao.MKJC;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWriting {
	
	
	public static void main(String[] args) throws IOException {
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Amy");
		jsonObject.put("age", 1);
		
		JSONArray array = new JSONArray();
		array.add("magical smile");
		array.add("magnetic eyes");
		
		jsonObject.put("special features", array);
		
		
		
		
		
		FileWriter fileWriter = new FileWriter("amy.json");
		
		fileWriter.write(jsonObject.toJSONString());
		
		fileWriter.close();
	}
	
	
	
	
	
	

}
