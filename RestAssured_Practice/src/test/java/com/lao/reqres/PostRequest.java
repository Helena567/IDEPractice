package com.lao.reqres;

import org.junit.Test;

import io.restassured.RestAssured;

public class PostRequest {
	
	@Test
	public void postRequest() {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
	}

}
