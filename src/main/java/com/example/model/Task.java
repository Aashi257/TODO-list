package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String desc;
	
	public Task() {
		
	}

	public Task(Integer id, String name, String desc, String status) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}
