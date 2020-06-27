package com.rest.test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Rest_Get {
	
	@Test
	public void GetWeatherDetails()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response resp = httpRequest.request(Method.GET,"/Bangalore");
		
		String responsebody = resp.getBody().asString();
		
		System.out.println("Response from URI   >>>>>> "+responsebody);
		
	}
	
	@Test
	public void GetWeatherConsolidated()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response resp = httpRequest.get("/Pune");
		
		System.out.println("Response from URI Pune  >>>>>> "+resp.asString());
		
		Assert.assertEquals(resp.getStatusCode(),200);
		Assert.assertEquals(resp.getStatusLine(), "HTTP/1.1 200 OK");
		// Header Vaildator
		System.out.println("  >>>>>> "+resp.header("Content-Type"));
		System.out.println("  >>>>>> "+resp.header("Server"));
		System.out.println("  >>>>>> "+resp.header("Content-Encoding"));
		Headers allHeaders = resp.headers();
		
		for(Header header : allHeaders){
			
			System.out.println("Key: "+header.getName()+"<<<  --------  >>>"+header.getValue());
		}
			
	}
	
	@Test
	public void GetWeatherInvaildCity()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		
		Response resp = httpRequest.get("/Be874588tul");
		
		System.out.println("Response from URI   >>>>>> "+resp.asString());
		
		assertEquals(resp.getStatusCode(),400);
	}
	
	
	@Test
	public void GetWeatherMessage()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.get("/Betul");
		String bodyAsString = resp.asString();
		
		Assert.assertEquals(bodyAsString.contains("Betul") , true , "Response body contains Betul");
	}
	
	
	@Test
	public void VerifyCityInJsonResponse()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response resp = httpRequest.get("/Betul");
		JsonPath respJson = resp.jsonPath();
		String city = respJson.get("City");
		
		System.out.println("Response City   >>>>>> "+city);
		Assert.assertEquals(city , "Betul" , "Response body contains Betul");
		
		// Print the temperature node
		System.out.println("Temperature received from Response " + respJson.get("Temperature"));
	 
		// Print the humidity node
		System.out.println("Humidity received from Response " + respJson.get("Humidity"));
	 
		// Print weather description
		System.out.println("Weather description received from Response " + respJson.get("Weather"));
	 
		// Print Wind Speed
		System.out.println("City received from Response " + respJson.get("WindSpeed"));
	 
		// Print Wind Direction Degree
		System.out.println("City received from Response " + respJson.get("WindDirectionDegree"));

	}
	

}
