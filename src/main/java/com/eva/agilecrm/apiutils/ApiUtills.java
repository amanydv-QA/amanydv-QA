	package com.eva.agilecrm.apiutils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiUtills {
	
	private String username="amanyadavji51@gydvmail.com";
	private String password="aman@8208";

	public Response getRequest(String id) {
		Response rspObj = RestAssured.given().auth().basic(username, password)
				.contentType(ContentType.JSON).accept(ContentType.JSON)
				.get("https://postmnapi.agilecrm.com/dev/api/contacts/" + id);
		return rspObj;

	}

	public Response postRequest(String jsonString, String requestUrl) {

		Response rspObj = RestAssured.given().auth().basic(username, password)
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(jsonString)
				.post(requestUrl);
		return rspObj;
	}

	public Response putRequest(String id, String firstName,String lastName,String email) throws IOException {
		String fileString="Data\\Properties.json";
		String getFileString= new String(Files.readAllBytes(Path.of(fileString)));
		JSONObject aJsonObject = new JSONObject(getFileString);
		aJsonObject.put("id", id);
		JSONArray jsArrObj = aJsonObject.getJSONArray("properties");
		JSONObject firstNameJsonObject = jsArrObj.getJSONObject(0);
		firstNameJsonObject.put("value",firstName);
		JSONObject lastNameJsonObject = jsArrObj.getJSONObject(1);
		lastNameJsonObject.put("value",lastName);
		JSONObject EmailObj=jsArrObj.getJSONObject(2);
		EmailObj.put("value",email);
		
		Response rspObj=RestAssured.given().auth().basic(username, password)
		.contentType(ContentType.JSON).accept(ContentType.JSON).body(aJsonObject.toString())
		.put("https://postmnapi.agilecrm.com/dev/api/contacts/edit-properties");
		return rspObj;

	}

	public void patchRequest() {

	}

	public Response deleteRequest(String id) {
		
		Response rspObj = RestAssured.given().auth().basic(username, password)
				.contentType(ContentType.JSON).accept(ContentType.JSON)
				.delete("https://postmnapi.agilecrm.com/dev/api/contacts/" + id);
		return rspObj;

	}
	
	public Response postRequestWithUploadFile(JSONObject aJsonObject,String filePath) {

		Response rspObj = RestAssured.given().auth().basic(username, password)
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(aJsonObject.toString())
				.multiPart(new File(filePath)).post("https://postmnapi.agilecrm.com/dev/api/contacts");
		return rspObj;
	}
	


}
