package com.eva.agilecrm.pojos.contact;

import java.util.List;

import org.json.JSONArray;

public class ContactRequestPojo {
	private String star_value;
	private String lead_score;
	private List<String> tags;
	private List<Property> properties;
	
	public ContactRequestPojo(String star_value,String lead_score,List<String> tags,List<Property> properties) {
		this.star_value=star_value;
		this.lead_score=lead_score;
		this.tags=tags;
		this.properties=properties;
	}
	
	public String getStar_value() {
		return this.star_value;
	}
	
	public void setStar_value(String star_value) {
		this.star_value=star_value;
	}
	
	public String getlead_score() {
		return this.lead_score;
	}
	
	public void setlead_score(String lead_score) {
		this.lead_score=lead_score;
	}
	
	public List<String> gettags() {
		return this.tags;
	}
	
	public void settags(List<String> tags) {
		this.tags=tags;
	}
	
	public List<Property> getproperties() {
		return this.properties;
	}
	
	public void setproperties(List<Property> properties) {
		this.properties=properties;
	}
	
	
}
