package com.jorgma.applications.users_community.model.user;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserId {
	
	@Column(name="ID")
	private String id;

	public UserId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
