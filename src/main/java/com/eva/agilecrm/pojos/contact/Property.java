package com.eva.agilecrm.pojos.contact;

import org.json.JSONObject;

public class Property {
	private String type;
	private String name;
	private String value;
	private String subtype;
	
	public Property(String type,String name,String value,String subtype) {
		this.type=type;
		this.name=name;
		this.value=value;
		this.subtype=subtype;
	}
	
	public Property() {
		
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void setValue(String value) {
		this.value=value;
	}
	
	public String getSubType() {
		return this.subtype;
	}
	
	public void setSubType(String subtype) {
		this.subtype=subtype;
	}
	
	
	
}
