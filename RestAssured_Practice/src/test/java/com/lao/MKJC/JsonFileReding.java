package com.lao.MKJC;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReding {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		String location = "amy.json";

		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader(location);
		Object parsedObject = jsonParser.parse(fileReader);
		

		// ---Retrieving data---

		JSONObject jsonObject = (JSONObject) parsedObject;
		
		String name= (String) jsonObject.get("name");
		Long age = (Long) jsonObject.get("age");
		JSONArray array = (JSONArray) jsonObject.get("special features");
		
		Iterator iterator = array.iterator();
				
		System.out.println(name);
		System.out.println(age);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
