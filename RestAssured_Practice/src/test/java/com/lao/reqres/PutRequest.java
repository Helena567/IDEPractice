package com.lao.reqres;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.RestAssured;

public class PutRequest {
	
	@Test
	public void putRequest() {
		
		 JSONObject jsonObject = new JSONObject();

	        jsonObject.put("name", "Agni");
	        jsonObject.put("job", "President");

	        System.out.println(jsonObject.toString());

	        RestAssured.baseURI="https://reqres.in";


	        RestAssured
	                .given()
	                .header("", "")
	                .body(jsonObject.toJSONString())
	                .when()
	                .put("/api/users")
	                .then()
	                .statusCode(200);

		
	}

}
