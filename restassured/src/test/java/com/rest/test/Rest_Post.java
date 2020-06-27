package com.rest.test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Post {
	
	@Test
	public void PostRegistration()
	{
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Ajay"); // Cast
		requestParams.put("LastName", "More");
		requestParams.put("UserName", "User001");
		requestParams.put("Password", "password001");
		requestParams.put("Email",  "someuser@gmail.com");
		
		request.body(requestParams.toJSONString());
		Response resp = request.post("/register");
		
		System.out.println("Status >>>>>>>>>> "+resp.getStatusCode());
		System.out.println("Status line >>>>>>>>>> "+resp.getStatusLine());
		
		
		System.out.println("Response body  >>>>>>>>>> "+resp.body().asString());
	}

}
