package com.lao.reqres;

import org.junit.Test;

import io.restassured.RestAssured;

public class DeleteRquest {
	
	@Test
	public void deleteRequest() {
		
		RestAssured.baseURI = "https://reqres.in";
		
		RestAssured
		.given()
			.header("", "")
		.when()
			.delete("/api/users/2")
		.then()
			.statusCode(204);
		
		
	}

}
