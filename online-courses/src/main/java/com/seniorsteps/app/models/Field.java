package com.seniorsteps.app.models;


public class Field {

	private int id;
	private String name;
	private String code;
	
	public Field() {}
	
	public Field(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString() {
		return "Field [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
}
