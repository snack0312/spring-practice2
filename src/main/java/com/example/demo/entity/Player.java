package com.example.demo.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Player {
	
	
	private Long id;
	  
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotNull(message="必ず入力してください")
	@Size(min=1, max=20, message="1文字以上20文字以下で入力してください")
	private String name;
	
	@NotNull(message="必ず入力してください")
	@Size(min=1, max=20, message="1文字以上20文字以下で入力してください")
	private String team;
	
	@NotNull(message="必ず入力してください")
	@Size(min=1, max=20, message="1文字以上20文字以下で入力してください")
	private String position;
	
	private Status status;

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	


}
