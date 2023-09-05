package com.lao.reqres;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;

public class PutRquest {
	
	@Test
	public void putRequest() {
		
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name","Agni");
		jsonObject.put("job","President");
		
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
		.given()
			.body(jsonObject.toJSONString())
		.when()
			.put("/api/users/2")
		.then()
			.statusCode(200);
		
	}

}
