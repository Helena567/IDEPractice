package com.lao.JsonSchemaValidation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSchemaValidationWithoutUsingClassPath {
	
	
@Test
public void validationWithoutUsingJsonSchemaInClassPath() throws FileNotFoundException{
	
	File inputJson = new File ("src/test/resources/input.json");
	File schemaJson = new File ("src/test/resources/schema.json");
//	File schemaJson1 = new FileInputStream ("src/test/resources/schema.json");
//	File schemaJson1 = new FileReader ("src/test/resources/schema.json");
	
	
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.header("Content-Type","application/json")
	.body(inputJson)
	.when()
	.post("/employees")
	.then()
	.body(JsonSchemaValidator.matchesJsonSchema(schemaJson));
	
	
	
	
}

}
