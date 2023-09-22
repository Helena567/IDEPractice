package com.lao.JsonSchemaValidation;
import java.io.File;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationUsingClassPath {
	
	
@Test
public void validationUsingJsonSchemaInClassPath(){
	
	File inputJson = new File ("src/test/resources/input.json");
	
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.header("Content-Type","application/json")
	.body(inputJson)
	.when()
	.post("/employees")
	.then()
	.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	
	
	
	
}
	
	
	

}
