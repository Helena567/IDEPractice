package com.lao.reqres;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;

public class PostRequest {
	
	@Test
	public void postRequest() {
		
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("name", "Agni");
		jsonObject.put("job", "Athibar");
		
		System.out.println(jsonObject.toString());
		
		RestAssured.baseURI="https://reqres.in";
		
		
		RestAssured
		.given()
			.header("", "")
			.body(jsonObject.toJSONString())
		.when()
			.post("/api/users")
		.then()
			.statusCode(201);
		
		
	}

}
